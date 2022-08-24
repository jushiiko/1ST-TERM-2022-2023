

public class Written {
    public static void main(String[] args) {
        /**int arr[]={23, 47, 90,31,53,92};
        System.out.println(find(arr));
    }
    public static int find(int num[]) {
        long st=System.nanoTime();
        int val = 0;
        for (int i=0; i<num.length;i++) {
            if (val<num[i])
                val=num[i];
        }
        long end=System.nanoTime();
        return val;*/

        String str="Malayan Colleges";
        String reverse="";
        int len=str.length()-1;
        for (int i = len; i>=0; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(str);
        System.exit(0);

    }
}
