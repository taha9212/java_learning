public class customers
{
    private String _firstname;
    private String _lastname;
    private int _identity;

    public customers(int _identity)
    {
        this._firstname = "No  firstname provided";
        this._lastname = "No last name provided";
        this._identity = _identity;
    }
    public customers(String _firstname, String _lastname, int _identity)
    {
        this._firstname = _firstname;
        this._lastname = _lastname;
        this._identity = _identity;
    } 

    public void printfinfo()
    {
        System.out.println("info");
        System.out.println("firstname: "+ _firstname + "\nlastname: "+ _lastname +"\nidentity: " + _identity);
    }
}