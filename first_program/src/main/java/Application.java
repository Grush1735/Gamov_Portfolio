public class Application {

    public static void main(String[] args) {
        // Есть книга. У нее k строк на странице, n - номер строки от начала книги. Номер строки на странице

        System.out.println(func(20, 30)); // 10
        System.out.println(func(20, 120)); //20
        System.out.println(func(20, 20)); // 20
        System.out.println(func(20, 2)); // 2


    }

    static int func(int k, int n){
        int num = k - (n % k);
        int num4 = k;
        //int num2 = k * (n / k);
        int num5 = n - k * (n / k - 1) - ((n % k) / k);
        int num6 = n ;
        // 20 .. 39
        return num5;
    }
}
