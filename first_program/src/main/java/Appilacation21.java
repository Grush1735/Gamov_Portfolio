import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Appilacation21 {

    public static void main (String[] args){
        int CurrentAmount = num("Hey... is it   working?");
        System.out.print(CurrentAmount);
    }

    public static int num(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int CurrentAmount = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
               CurrentAmount++;
            }
        }
        return CurrentAmount;
    }
}


