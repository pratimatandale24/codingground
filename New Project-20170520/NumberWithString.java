import java.util.Scanner;
public class NumberWithString{
    public static void main(String []args)
    {
        for(int i=1; i<=100; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("raja software");

            }else
            if(i%3==0)
            {
                System.out.println("raja");
            }
            else
            if(i%5==0)
            {
                System.out.println("software");
            }
            System.out.println(""+i);
        }
    }
}
