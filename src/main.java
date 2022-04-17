import java.util.Scanner;

public class main {
    public static <string> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи длину цикла");
            int b = input.nextInt();
            System.out.println("Введи число для умножения");
            int mult = input.nextInt();
            int res = 0;
            int a = 0;
            while (a != b) {
                a++;
                res = mult * a;
                System.out.println(res);
            }


    }

}
