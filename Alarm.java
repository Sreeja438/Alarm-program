import java.util.*;
public class Alarm {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String alarm=sc.next();
        while(!(alarm.equalsIgnoreCase("cancle")))
        {
            System.out.println("wake up");
            alarm=sc.next();
        }
        
    }
}
