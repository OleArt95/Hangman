package main.java.com.olegart.hangman;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("Начать новую игру");

            char inputCommand = scanner.nextLine().toLowerCase(Locale.ROOT).charAt(0);

            if (inputCommand == 'h') {
                System.out.println("Доступные команды:\n n - начать новую игру,\n e - выйти из игры,\n h - получение справки\n");
            }

            if (inputCommand == 'e') {
                System.out.println("Игра завершена");
                break;
            }

            if (inputCommand == 'n') {
                System.out.println("Игра началась");
                // реализация логики игрового цикла
            }
        }
    }
}
