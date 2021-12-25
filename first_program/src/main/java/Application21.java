import java.util.HashMap;

public class Application21 {

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


