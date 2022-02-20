import java.util.Scanner;
import java.io.*;

class exception extends Exception
{
    exception()
	{
		System.out.println("Insufficient Balance");
	}
}

class main
{
	int bal=0;

    void deposit(int amt)
	{
		bal=bal+amt;
		System.out.println("Balance:"+bal);
	}

	void withdraw(int amt)throws exception
	{
		if(bal<500)
			throw new exception();
		else if(bal<amt)
			throw new exception();
		else
		{
			bal=bal-amt;
			System.out.println("Balance:"+bal);
		}	
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		main obj=new main();
        int opt;
		do
		{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Exit");
			opt=sc.nextInt();

			if(opt==1)
			{
				System.out.println("Enter the amount to be deposited");
				int amt=sc.nextInt();
				obj.deposit(amt);
			}
			else if(opt==2)
			{
				System.out.println("Enter the amount to be withdrawn");
				int amt=sc.nextInt();
				try
				{
					obj.withdraw(amt);
				}
				catch(exception e)
				{}
			}
			else if(opt!=3)
				System.out.println("Enter a valid option");
		}while(opt!=3);

	}


}
