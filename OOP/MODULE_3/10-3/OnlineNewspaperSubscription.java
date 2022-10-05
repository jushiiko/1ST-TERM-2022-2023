public class OnlineNewspaperSubscription extends NewspaperSubscription
{
    public void setAddress(String a)
    {
        // write your code here
        if (a.contains("@"))
        {
            address = a;
            rate = 9;
        }
        else
        {
            address = "Invalid Address";
            rate = 0;
        }
    }

}

