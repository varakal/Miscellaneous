using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace Banktransactions
{
    class BankAccountClass
    {
        double value;

        public double interestRate=0; 		// Used to access the 

        public void deposit(double x)		// Deposits the sent amount to the account(value)
        {
            value+=x;
        }
        
        public void withdraw(double y)		// Withdraws the specified amount from the account(value)
        {
            value-=y;
        }
        
        public void addInterest()		// Adds conditional interest
        {
            if(interestRate==0)
            {
               value+=(2*value)/100;		// If interest value is not mentioned, 2% interest is added 
            }
            else
            {
                value+=(interestRate*value)/100;// If the interest value is mentioned, then interestRate% interest is added 
            }
            interestRate = 0;			// interestRate is made 0 to accomadate next interest transaction, which can be either condition 1 or 2
        }
        
        public double getBalance()
        {
            return value;
        }

    }

    public class Program
    {
        public static void Main(string[] args)
        {
            double balance;
            BankAccountClass bankAccount= new BankAccountClass();
            bankAccount.deposit( 800 );
            bankAccount.deposit( 200 );
            balance = bankAccount.getBalance(); 
            Console.WriteLine("THE ACCOUNT BALANCE IS = "+balance);// 1000
            bankAccount.addInterest();
            balance = bankAccount.getBalance(); 
            Console.WriteLine("THE ACCOUNT BALANCE IS = "+balance);// 1020
            bankAccount.withdraw( 20 );
            balance = bankAccount.getBalance(); 
            Console.WriteLine("THE ACCOUNT BALANCE IS = "+balance);// 1000
            bankAccount.interestRate = 10;
            bankAccount.addInterest();
            balance = bankAccount.getBalance(); 
            Console.WriteLine("THE ACCOUNT BALANCE IS = "+balance);// 1100
            bankAccount.withdraw(100);				   // 1000	
            bankAccount.addInterest();
            balance=bankAccount.getBalance();
            Console.WriteLine("THE ACCOUNT BALANCE IS = "+balance);// 1020 
         }
    }
}
