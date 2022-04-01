public class Application {
    public static void main(String[] args) {
        String sent1 = "Проверка проверка... ";
        String sent2 = "Проверка проверка... 12,3";
        String sent3 = "У меня здесь (в этой строке) более много символов ! У меня здесь (в этой строке) более много символов !У меня здесь (в этой строке) более много символов !";
        StringHelper string = new StringHelper(sent2);
        System.out.println(StringHelper.getFirstNumber());
    }
}
