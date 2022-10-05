public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String a) {
        // write your code here
        if (a.contains("0") || a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4")
                || a.contains("5") || a.contains("6") || a.contains("7") || a.contains("8") || a.contains("9")) {
            address = a;
            rate = 15;
        } else {
            address = "Invalid Address";
            rate = 0;
        }

    }

}
