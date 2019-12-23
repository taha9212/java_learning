public class ternary{
    public static void main(String[] args) {
        String name = "taha";
        boolean check = name.equals("taha") ? true : false;
        System.out.println(check);
        String recheck = name.equals("aha") ? "correct" : "wrong";
        System.out.println(recheck);
    }
}