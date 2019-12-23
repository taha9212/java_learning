public class triangle{
    public static void main(String[] args) {
        int i, k, j;
        for(i = 0; i < 10; i++){
            for(k = i; k < 10; k++){
                System.out.print(" ");
            }
            
            for(j = 0; j < (i*2)-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}