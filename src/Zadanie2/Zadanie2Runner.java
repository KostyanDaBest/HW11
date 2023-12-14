package Zadanie2;
import java.util.Scanner;
public class Zadanie2Runner {
        public static void main(String[] args) {
            System.out.println("Введите 5 строк:");
            Scanner scanner = new Scanner(System.in);
            String[] strings = new String[5];
            for (int i = 0; i < strings.length; i++) {
                strings[i] = scanner.nextLine();
            }
            Zadanie2StringOperator operator = new Zadanie2StringOperator(strings);
            operator.print();
        }
    }




