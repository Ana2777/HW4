public class Main {
    public static void main(String[] args) {
// Задание 1
        int a = 0;
        while(a < 10) {
            ++a;
            System.out.print("" + a + " ");
        }
        System.out.println(" ");
        int b = 11;
        while(b > 1) {
            --b;
            System.out.print("" + b + " ");
        }
        System.out.println(" ");
// Задание 2
        int friday = 5;
        for (; friday >= 31; friday = friday + 7); {
            friday = friday + 7;
            System.out.println("Сегодня пятница " + friday + " Нужно сделать отчет!");
        }

// Задание 3
        int startYear = 1822;
        int lastYear = 2122;
        for(a = startYear; a <= lastYear; ++a) {
            if (a % 79 == 0) {
                System.out.println(a);
            }
        }
    }
}