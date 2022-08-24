

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
    
    //Time complexity - 
    //Max


    public int max(int num[] ) {
        int highest=num[0]; //1
            //1         //n+1   n
        for(byte i=0; i<num.length;i++){
            //n+1
            if(num[i]>highest)
            highest=num[i]; //1
        }
        return highest; //1

        //Time complexity - 3n+5, if n=10
        //Time complexity - 35 units
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