import java.util.Scanner;
public class ATM
{
    public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine\n");
            System.out.println("Choose 1 for Withdraw Money");
            System.out.println("Choose 2 for Deposit Money");
            System.out.println("Choose 3 for Check Total Balance");
            System.out.println("Choose 4 for EXIT from Machine");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Total Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}