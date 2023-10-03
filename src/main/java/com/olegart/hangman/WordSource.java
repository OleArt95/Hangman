package main.java.com.olegart.hangman;

import java.util.Random;

public class WordSource {

    String[] words = new String[]{"кот", "печенье", "кино", "пень", "перчатка", "процессор", "топор", "инициализация",
            "гомункул", "ноутбук"};

    public String getRandomWord() {
        int arraySize = words.length;

        Random random = new Random();

        int randomIndex = random.nextInt(arraySize);

        return words[randomIndex];
    }
}
