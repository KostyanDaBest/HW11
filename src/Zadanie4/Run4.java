package Zadanie4;

import java.util.Scanner;

public class Run4 {
    public static void main(String[] args) {

        System.out.println("Введите 5 строк:");
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        Operator4 operator = new Operator4(strings);
    }
}
