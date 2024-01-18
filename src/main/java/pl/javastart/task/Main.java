package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int min = 100;
        final int max = 200;
        int number;
        boolean isIncorrect = true;
        do {
            System.out.println("Podaj liczbe");
            number = scanner.nextInt();
            if (number > max) {
                System.out.println("Liczba jest za duza");
            } else if (number < min) {
                System.out.println("Liczba jest za mala");
            } else if (number % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            } else {
                isIncorrect = false;
            }
        } while (isIncorrect);
        System.out.println("Twoja liczba jest ok");
    }
}
