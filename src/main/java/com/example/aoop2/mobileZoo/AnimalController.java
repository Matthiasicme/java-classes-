package com.example.aoop2.mobileZoo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalController {
    @GetMapping("/list2")
    public String list() {
        System.out.println("welcome to the jungle"); //printing goes to the console
        return "zootest";
        //Double randomNumber = new Random().nextDouble(); //there can be rules defining which template to show to the user, f.ex logged in, not logged in, admin. Rules not as stupid as this one
        //if (randomNumber < 0.5) {
        //    return "zootest";
        //} else {
        //    return "newanimal"}
    }

    @GetMapping("/list")
    public String list(Model model){
        System.out.println("welcome to the jungle");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("dog", "pieseł", true));
        animals.add(new Animal("lion", "simba", true));
        animals.add(new Animal("bear", "badboy", true));

        model.addAttribute("animals", animals);
        return "animal/zootest";

        /*model.addAttribute("dogName", "Szarik");
        model.addAttribute("catName", "Sierściuch");
        model.addAttribute("numberOfAnimals", "2");
        model.addAttribute("theyAreAlive", true);*/

//        return "zootest";
    }



    @GetMapping("/new")
    public String newanimal(Model model) {
        model.addAttribute("animal", new Animal());
        return "animal/newanimal";
    }

    @PostMapping("/add")
    public String addAnimal(@ModelAttribute("animal")Animal newAnimal, Model model){
        System.out.println(newAnimal);
        //List<Animal>animals = new ArrayList<>();
        //animals.add(newAnimal);
        Animal.savedAnimals.add(newAnimal);

        model.addAttribute("animals", Animal.savedAnimals);
        return "zootest";

    }

}