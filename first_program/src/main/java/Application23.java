public class Application23 {

    public static void main(String[] args){
        boolean checker = true;
        int z = 555; // число на вводе (из условия задачи)
        int a = 4; // кол-во строк в листе
        int b = 5; // кол-во элементов в каждой строке
        int [][] TDA = new int[a][b]; //задание массива массивов

        // проверка кол-ва массивов в массиве == кол-ву символов в целом числе
        int count = NumberCount (z); //посчитали кол-во символов в числе
        int length = TDA.length; // посчитали кол-во массивов в массиве
        if (count != length) //проверка кол-ва массивов в массиве TDA == кол-ву символов в целом числе
            checker = false;

        // проверка кол-ва чисел в массиве == каждому из цифр в целом числе
        int [] zArray = new int[count]; // задание массива с длиной в кол-во цифр в числе z
        for (int i = count - 1; i > -1; i--){ // перевели число z в массив
            zArray[i] = z % 10;
            z /= 10;
        }
        if (checker) { //если чекер сработает, то массивы zArray == кол-ву массивов в массиве
            for (int j = 0; j < count; j++){
                if (TDA[j].length != zArray[j]) {
                    checker = false;
                    break;
                }
            }
        }
        String name = ;
        System.out.println("Звонит %s", name);
        System.out.print(checker); // вывод ответа
    }

    public static int NumberCount (Integer number){ // расчет кол-ва символов в числе z
        int count = 0;
        while (number != 0){ //кол-во символов в числе
            count++;
            number /= 10;
        }
        return count;
    }
}
