package bankaccount;

public class AccountRun {
    public static void main(String[] args) {
    Account acct = new Account();
    
    acct.accb1 = 150.00; acct.accrb1 = acct.accb1;
    acct.accb2 = 500.53; acct.accrb2 = acct.accb2;
    
    /*acct.Balanceinfo(); // Has the info about the account balance*/
    
    
    acct.showbalance(); // Shows the balance account
    
    
    acct.debit(); // Debit Method
    
    
    
    }
    
}
