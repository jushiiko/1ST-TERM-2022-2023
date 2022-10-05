public abstract class Division
{
    protected String divisionTitle;
    protected int acctNum;
    public Division(String title, int acct)
    {
        // write your code here
        divisionTitle = title;
        acctNum = acct;
    }
    public abstract void display();
}

