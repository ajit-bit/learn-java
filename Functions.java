
/*   Print the Own input
    public class Functions{
     
        public static void PrintMyName(String name){
System.out.println(name);
return;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the name ");
            String name = sc.next();
            PrintMyName(name);
        }
        /* */

/*
CALCULATOR using function and switch case

        public class Functions{
        public static int sum(int a,int b){
            int sum = a+b;
            System.out.println("sum of two number is "+sum);
            return sum;
        }  
        public static int sub(int a,int b){
            int sub = a-b;
            System.out.println("sub of two number is "+sub);
            return sub;
        }  
        public static int mul(int a,int b){
            int mul = a*b;
            System.out.println("mul of two number is "+mul);
            return mul;
        }  
        public static int div(int a,int b){
            int div = a/b;
            System.out.println("div of two number is "+div);
            return div;
        }  
          public static void main(String args[])
          {
            Scanner sc=new Scanner(System.in);
           
            System.out.println("enetr the choice");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. Division");
            int choice=sc.nextInt();
            System.out.println("enetr the first number");
            int a=sc.nextInt();
            System.out.println("enetr the second number");
            int b=sc.nextInt();
            switch(choice){
                case 1:
            int sum=sum(a,b);
            break;
            case 2:
            int sub=sub(a,b);
            break;
            case 3:
            int mul=mul(a,b);
            break;
            case 4:
            int div=div(a,b);
            break;
            
            default:
            System.out.println("the choice is invalid");
            break;
        }
    }
        }
/* */
/*practice questions
Q-1 average of any 3 numbers
public class Functions{
    public static void average(int a,int b ,int c)
    {
        int avg=a+b+c;
        int avgs=avg/3;
        System.out.print("average of number is :"+avgs);
        return;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the number");
        int b=sc.nextInt();
        System.out.println("enter the number");
        int c=sc.nextInt();
        average(a, b, c);
    } 
}
/* */
/* Q2 sum of odd numbers
public class Functions{
    public static void SumOdd(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i %2!=0){
                sum=sum+i;
            }
        }
        System.out.print("sum is :"+sum);
        return;
    }
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        SumOdd(n);
    }
}/* */
