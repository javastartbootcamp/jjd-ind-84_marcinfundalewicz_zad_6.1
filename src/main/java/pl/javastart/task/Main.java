package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int number = scanner.nextInt();
        int min = 100;
        int max = 200;
        while (number % 3 != 0) {
            if (number > max) {
                System.out.println("Liczba jest za duza");
                System.out.println("Podaj liczbe");
                number = scanner.nextInt();
            } else if (number < min) {
                System.out.println("Liczba jest za mala");
                System.out.println("Podaj liczbe");
                number = scanner.nextInt();
            } else if (number % 3 != 0) {
                System.out.println("Liczba niejest podzielna przez 3");
                System.out.println("Podaj liczbe");
                number = scanner.nextInt();
            }
        }
        System.out.println("Twoja liczba jest ok");
    }
}
