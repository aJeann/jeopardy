package com.example.jeopardy;

import com.example.jeopardy.repositories.CategoryRepository;
import com.example.jeopardy.repositories.GameRepository;
import com.example.jeopardy.tables.Category;
import com.example.jeopardy.tables.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class JeopardyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeopardyApplication.class, args);
    }

}

@RestController
@CrossOrigin
class HelloWorldController {
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    Category currentCategory = new Category();
    Game currentGame = new Game();

    @RequestMapping ("/")
    public String index(){return "Hello World!!!";}

    @GetMapping(path = "/addGame")
    public @ResponseBody
    void addGame(@RequestParam String name){

        currentGame = gameRepository.findByName(name);

        if(currentGame == null){
            currentGame.setName(name);
            gameRepository.save(currentGame);
        }


    }

    @GetMapping(path = "/addCategory")
    public @ResponseBody
    void addCategory(@RequestParam Long game_id, @RequestParam String name, @RequestParam String q1, @RequestParam String a1,
                         @RequestParam String q2, @RequestParam String a2, @RequestParam String q3, @RequestParam String a3,
                         @RequestParam String q4, @RequestParam String a4, @RequestParam String q5, @RequestParam String a5, @RequestParam String finalA, @RequestParam String finalQ) {

        currentGame = gameRepository.findById(game_id).get();

        currentCategory.setGame(currentGame);
        currentCategory.setName(name);
        currentCategory.setQuestion1(q1);
        currentCategory.setQuestion2(q2);
        currentCategory.setQuestion3(q3);
        currentCategory.setQuestion4(q4);
        currentCategory.setQuestion5(q5);
        currentCategory.setAnswer1(a1);
        currentCategory.setAnswer2(a2);
        currentCategory.setAnswer3(a3);
        currentCategory.setAnswer4(a4);
        currentCategory.setAnswer5(a5);
        currentCategory.setFinalA(finalA);
        currentCategory.setFinalQ(finalQ);

        categoryRepository.save(currentCategory);

    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Game> getAllGames() {
        return gameRepository.findAll();
    }

}
