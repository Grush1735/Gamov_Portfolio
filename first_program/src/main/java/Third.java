import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Введите число: ");
        int a = scanner.nextInt();
        if (a%2==0) {
            System.out.printf("%d - Это четное число ", a);
        }   else {
            System.out.printf("%d - Это нечетное число ", a);
        }







    }
}

