import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Fourth {

    public static void main(String[] args){
        LocalTime time2 = LocalTime.now();
        int time =  time2.getHour();
        if (time >= 5 && time < 12) {
            System.out.println("Доброе утро, {username}");
        } else {
            if (time >= 12 && time < 16){
                System.out.println("Добрый день, {username}");
            } else {
                if (time >= 16 && time < 23){
                    System.out.println("Добрый вечер, {username}");
                } else {
                    System.out.println("Доброй ночи, {username}");
                }
            }
        }
    }

}
