public class DomesticDivision extends Division
{
    protected String state;
    public DomesticDivision(String title, int acct, String st)
    {
        // write your code here
        super(title, acct);
        state = st;
    }
    public void display()
    {
        // write your code here
        System.out.println("Division: " + divisionTitle);
        System.out.println("Account Number: " + acctNum);
        System.out.println("State: " + state);
    }
}

