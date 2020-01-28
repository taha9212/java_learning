import java.util.Random;
class random
{
    Random generator = new Random();
    int num = generator.nextInt(3);
    public random() {
    }
    public void Account(){
        switch(num)
        {
            case 1:
                System.out.println("Account no: 13549874434432");
                break;
            case 2:
                System.out.println("Account no: 844841314613414");
                break;
            case 3:
                System.out.println("Account no: 4821315114156111");
                break;
            default:
                System.out.println("Account no: 87463132138131512");
                break;
        }
    }

}