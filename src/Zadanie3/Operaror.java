package Zadanie3;

public class Operaror {
    private String[] strings;

    public Operaror(String[] strings) {
        this.strings = strings;
        operation();
    }

    private void operation() {
        int total = 0;
        for (int i = 0; i < strings.length; i++) {
            total += strings[i].length();
        }
        int average = total / strings.length;

        for (String s : strings) {
            if (s.length() < average) {
                System.out.println("Cтрока " + s + "//Длина строки: " + s.length());
            }
        }
    }
}
