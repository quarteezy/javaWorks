package bankaccount;
import java.util.Scanner;
import java.text.*;
public class Account 
{
    Scanner dm = new Scanner(System.in);    
    DecimalFormat df = new DecimalFormat("#,###.00");
    
    double accb1;     double accb2;
    double accrb1;    double accrb2;
    double wAmount;
    
    /*public void Balanceinfo()
    {
    accb1 = 150.00;
    accb2 = 500.53;
    accrb1 = accb1;
    accrb2 = accb2;
    }*/
    
    
    public final void showbalance()
    {
    System.out.println("account1 balance: " + "$" + df.format(accb1));
    System.out.println("account2 balance: " + "$" + df.format(accb2));
    }
    
    
    public void debit()
    {
    
    
    System.out.println();
    System.out.print("Enter withdrawal amount for account1: "); 
    wAmount = dm.nextDouble();
    System.out.println();
    
        if(wAmount<=accb1)
        {
            System.out.println("Subtracting $" + df.format(wAmount) + " from account1 balance " );
            accrb1 = accb1 - wAmount;
            System.out.println("account1 balance: " + "$" + df.format(accrb1));
            System.out.println("account2 balance: " + "$" + df.format(accrb2));
        }else if(wAmount>accb1)
        {
            System.out.println("Subtracting $" + df.format(wAmount) + " from account1 balance" );
            System.out.println("Debit amount exceeded account balance.");
            System.out.println("account1 balance: " + "$" + df.format(accrb1));
            System.out.println("account2 balance: " + "$" + df.format(accrb2)); 
        }
    
    System.out.println();
    System.out.print("Enter withdrawal amount for account2: "); 
    wAmount = dm.nextDouble();
    System.out.println();
        if(wAmount<=accb2)
        {
            System.out.println("Subtracting $" + df.format(wAmount) + " from account2 balance " );
            accrb2 = accb2 - wAmount;
            System.out.println("account1 balance: " + "$" + df.format(accrb1));
            System.out.println("account2 balance: " + "$" + df.format(accrb2));
        }else if(wAmount>accb2)
        {
            System.out.println("Subtracting $" + df.format(wAmount) + " from account2 balance" );
            System.out.println("Debit amount exceeded account balance.");
            System.out.println("account1 balance: " + "$" + df.format(accrb1));
            System.out.println("account2 balance: " + "$" + df.format(accrb2)); 
        }
    
    }
    
    
    
}