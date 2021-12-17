import java.util.Scanner;

public class Second {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a:");
        double a = scanner.nextDouble();
        System.out.print("Введите b:");
        double b = scanner.nextDouble();
        double F1 = a/b;
        System.out.print(F1);
    }
}
