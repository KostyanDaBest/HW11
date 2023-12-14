import java.util.Scanner;
import java.util.Arrays;
public class Zadanie1 {
        public static void main(String[] args) {
            System.out.println("Введите 5 строк:");
            Scanner scanner = new Scanner(System.in);
            String[] strings = new String[5];
            for (int i = 0; i < strings.length; i++) {
                strings[i] = scanner.nextLine();
            }
            int max = strings[0].length();
            String bolshayaStroka = strings[0];
            int min = strings[0].length();
            String korotkayaStroka = strings[0];
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() > max) {
                    max = strings[i].length();
                    bolshayaStroka = strings[i];
                }
                if (strings[i].length() < min) {
                    min = strings[i].length();
                   korotkayaStroka = strings[i];
                }
            }
            System.out.println(Arrays.toString(strings));
            System.out.println("Самая длинная: " + bolshayaStroka + "/ её длина:" + max);
            System.out.println("Самая короткая: " + korotkayaStroka + " /её длина:" + min);
        }

    }


