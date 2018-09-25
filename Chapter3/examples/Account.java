// Fig. 3.13: Account.java
// Account class with a constructor to validate and initialize
// instance variable balance of type double.
// Java How to Program, 10th Ed. (Deitel) Page 89
//


public class Account
{
   private double balance;

   public Account( double initialBalance )
   {
      if ( initialBalance > 0.0 )
         balance = initialBalance;
   }

   public void credit( double amount )
   {
      balance = balance + amount;
   }

   public double getBalance()
   {
      return balance;
   }
}
