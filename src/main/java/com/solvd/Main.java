package com.solvd;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

//        ILandAnimal dog = new Dog("Azor");
//        ILandAnimal cat = new Cat("Kitty");
//        ISeaAnimal dolphin = new Dolphin("Flipper");
//
//        System.out.println(dog.getName() + " says:");
//        dog.makeSound();
//        dog.walk();
//
//        System.out.println("\n" + cat.getName() + " says:");
//        cat.makeSound();
//        cat.walk();
//
//        System.out.println("\n" + dolphin.getName() + " says:");
//        dolphin.makeSound();
//        dolphin.swim();

        // reading a file and splitting it into words
        String[] words = StringUtils.split(
                FileUtils.readFileToString(new File("src/main/resources/input.txt"), StandardCharsets.UTF_8).toLowerCase(),
                " .,!?");

        //using HasMapto store words - if the word already exists in Map - we increment its counter
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        //saving result directly as String with loop
        StringBuilder result = new StringBuilder("Number of unique words: " + wordCountMap.size() + "\nWord counts:\n");
        wordCountMap.forEach((word, count) -> result.append(word).append(": ").append(count).append("\n"));

        //saving result to output.txt file
        FileUtils.writeStringToFile(new File("src/main/resources/output.txt"), result.toString(), StandardCharsets.UTF_8);

        System.out.println("Result saved to output.txt");
    }
}
