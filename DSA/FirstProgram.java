package DSA;

public class FirstProgram {
    public static void main(String[] args) {
    int num[]= {23,45,67,100,90};
    System.out.println(num.length);
    num[2]=45;
    System.out.println(num[3]);

    for(int i=0;i<num.length;i++)
    {
        System.out.println(num[i]+" ");
    }
    FirstProgram p=new FirstProgram();
    int highest=p.max(num);
    System.out.println(highest);
    }
    
    public int max(int num[] ) {
        int highest=num[0];
        
        for(byte i=0; i<num.length;i++){
            if(num[i]>highest)
            highest=num[i];
        }
        return highest;
    }

    public int sum(int num[]) {
        int sum=0;
        for (byte i=0; i<num.length;i++) {
            if(num[i]%2!=0) {
                sum +=num[i];
            } //end of if
        } //end of loop
        return sum;
    } //end of method



}