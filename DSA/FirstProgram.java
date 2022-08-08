package DSA;

public class FirstProgram {
    public static void main(String[] args) {
        //Primitive Type - stack memory
        //Arrays - heap memory
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
    
    }
    public int max(int num[] ) {
        return 0;
    }

    public void sum (int num[] ) {
    
    }



}