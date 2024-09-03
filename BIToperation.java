/* 
public class BIToperation {
    public static void main(String args[])
    {
        int n=5;
        int pos=2;
        int BM =1<<pos;
        if((BM & n) == 0){
            System.out.println("was 0");
        }
        else{
            System.out.println("was 1");
        }
    }
}s
    


public class BIToperation {
    public static void main(String args[])
    {
        int n=5;
        int pos=1;
        int BM =1<<pos;
        int Ne =BM | n;
        System.out.println(Ne);

    }
}
    */
    public class BIToperation {
        public static void main(String args[])
        {
            int n=5;
            int pos=2;
            int BM =1<<pos;
            int not=~(BM);
            int N=not & n;
            System.out.println(N);


        }
    }