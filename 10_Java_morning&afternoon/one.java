import java.util.*;  

public class one{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String input, source, target;
        input=sc.nextLine();
        source=sc.nextLine();
        target=sc.nextLine();
        
        String ans=input.replaceAll(source, target);
        System.out.println(ans);
     }
}