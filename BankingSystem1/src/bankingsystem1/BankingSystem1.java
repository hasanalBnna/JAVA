package bankingsystem1;

import java.util.Scanner;
class Customer{
       String name,address;
       int age;
}
class Account{
       String accType,branchType;
}
class RBI{ 
       int withLimit,n;
       double A,P,r;
       float t;
       long average,total,mb;
      
       int setWithdrawalLimit() {
           Scanner input = new Scanner(System.in);
           String actype=input.nextLine();
           String brtype=input.nextLine();
           if("SAVINGS".equals(actype) && "METRO".equals(brtype)) {
               withLimit = 5000;
           }else {
               withLimit = 4000;
           }
       return withLimit;
       }
      
       double setInterestRate() {
           A=(P+r)/n*t;
           return A;
       }
      
       long setMAB() {
           mb=(average*total)/31;
           return mb;
       }
   }
  
   class SBI extends RBI{ 
       @Override
       double setInterestRate() {
           A=P*(1+r/n)+n*t;
           return A;
       }
       @Override
       long setMAB() {
           mb=(average+total)/30;
           return mb;
       }
   }
  
   class ICICI extends RBI{ 
       @Override
       double setInterestRate() {
           A=(P*r)/n+t;
           return A;
       }
      
       @Override
       int setWithdrawalLimit() {
           withLimit=7000;
           return withLimit;
       }
   }

public class BankingSystem1 {
public static void main(String args[]) {
SBI objsbi = new SBI();
ICICI icici = new ICICI();
objsbi.P=10.433;
objsbi.r=7.42;
objsbi.n=5;
objsbi.t=7;
Double sbiInt=objsbi.setInterestRate();
System.out.println("SBI interest rate is:"+sbiInt);
int iciciWL= icici.setWithdrawalLimit();
System.out.println("ICICI withdraw limit is:"+iciciWL);
}
}