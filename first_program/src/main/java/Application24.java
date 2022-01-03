public class Application24 {

    public static void main(String[] args){
        boolean checker = false;
        int a = 5; // Длина массива
        int [] array = new int [a];
        int N = 15;
        System.out.print(func(checker,[1, 2, 3, 4, 5], 3));

    }

    public static boolean func(boolean checker1, int[] Array, int n){
        for (int i = 0; i < Array.length; i++){
            for (int j = i + 1; j < Array.length; j++){
                if (Array[i] + Array[j] == n) {
                    checker1 = true;
                    break;}
            }
        }
        return checker1;
    }
}
