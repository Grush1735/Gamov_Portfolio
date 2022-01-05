public class Application24 {

    public static void main(String[] args){
        boolean checker = false;
        int a = 5; // Длина массива
        System.out.println(func(false,4, new int[] {2, 3, 4, 5})); //false
        System.out.println(func(false,4, new int[] {2, 2, 3, 4})); //true
        System.out.println(func(false,6, new int[] {2, 2, 3, 4})); //true
    }

    public static boolean func(boolean checker1, int n, int[] Array){
        for (int i = 0; i < Array.length; i++){
            for (int j = i + 1; j < Array.length; j++){
                if (Array[i] + Array[j] == n) {
                    checker1 = true;
                    break;
                }
            }
        }
        return checker1;
    }
}
