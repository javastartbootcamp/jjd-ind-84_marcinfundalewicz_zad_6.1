package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 100;
        int max = 200;
        int number;
        do {
            System.out.println("Podaj liczbe");
            number = scanner.nextInt();
            if (number > max) {
                System.out.println("Liczba jest za duza");
            } else if (number < min) {
                System.out.println("Liczba jest za mala");
            } else if (number % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            }
        } while (number % 3 != 0 || (number < 100) || (number > 200));
        System.out.println("Twoja liczba jest ok");
    }
}
