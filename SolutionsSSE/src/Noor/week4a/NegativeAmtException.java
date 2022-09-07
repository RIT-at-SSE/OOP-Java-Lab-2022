package Noor.week4a;
import java.util.Scanner;
class NegativeAmtException extends Exception
{
    String msg;
    NegativeAmtException(String msg)
    {
        this.msg=msg;
    }
    public String toString()
    {
        return msg;
    }
}
class userdefined
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Amount:");
        int a=s.nextInt();
        try
        {
            if(a<0)
            {
                throw new NegativeAmtException("Invalid Amount since it is negative value");
            }
            System.out.println("Amount Deposited");
        }
        catch(NegativeAmtException e)
        {
            System.out.println(e);
        }
    }
}