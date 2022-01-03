import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class Application25 {

    public static void main(String[] args){
        String[] names = new String[]{"Попов", "Гамов", "Жуков", "Батони"};
        double [] marks1 = new double[]{1, 2, 3.5, 4};
        double [] marks2 = new double[]{5.5, 5.2, 5.4, 5.5};
        double [] marks3 = new double[]{5.6, 5.2, 5.4, 5.5};
        func(names, marks1);
        func(names, marks2);
        func(names, marks3);
    }

    public static void func(String[] names,double[] marks){
        double max = 0;
        int z = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max){
                max = marks[i];
                z = i;
            }
        }
        System.out.println(names[z]);
    }
}
