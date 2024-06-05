import java.util.*;
public class Input{
    public static void main(String[] args){
        try (Scanner s1 = new Scanner(System.in)) {
            int a=s1.nextInt();
            int c= a*a;
            System.out.println(c);
        }
    }
}