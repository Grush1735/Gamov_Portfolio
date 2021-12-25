import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application22 {

    public static void main(String[] args){
        Scanner insert = new Scanner(System.in);
        System.out.print("Введите число ");
        int z = insert.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 3; i <= z; i++){
            boolean check = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) list.add(i);
        }
        System.out.print(list);
    }

}
