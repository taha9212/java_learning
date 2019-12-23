public class numeric_method{
    public static void main(String[] args){
        int x = 10, y = 20;
        System.out.println(Integer.max(x,y));
        System.out.println(Integer.min(x,y));
        String money = "300";
        System.out.println(Integer.valueOf(money)); // object
        System.out.println(Integer.parseInt(money)); // premetive
        System.out.println(Integer.compare(y,x));
    }
}