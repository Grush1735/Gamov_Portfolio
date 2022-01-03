import java.text.DecimalFormat;

public class Application27 {

    public static void main(String[] args){
        int[][] arrays = new int[][]{{1, 3, 5}, {2, 4, 3, 5, 6}, {1, 1, 1, 2}, {5, 4, 5, 5, 5, 5}};
        String[] names = new String[]{"Попов", "Гамов", "Жуков", "Батони"};
        for (int[] array : arrays) {
            double mean = 0;
            for (int i : array) {
                mean += i;
            }
            mean /= array.length;
            DecimalFormat round = new DecimalFormat("##.####");
            System.out.println(round.format(mean));
        }
    }
}
