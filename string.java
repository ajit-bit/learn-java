/* 
public class string {
    public static void main(String[] args) {
        String fn="Tony";
        String ln="Stark";
        String Fn=fn+ln; 
         System.out.println(Fn.length());

         for(int i=0;i<Fn.length();i++)
         {
            System.out.println(Fn.charAt(i));
         }
      }
    
}*/
public class string {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Tony");
       for(int i=0;i<sb.length()/2;i++)
       {
        int front =i;
        int back = sb.length()-1-i;
        char frontChar =sb.charAt(front);
        char backChar =sb.charAt(back);
       }
            System.out.println(sb);
        }
    }

