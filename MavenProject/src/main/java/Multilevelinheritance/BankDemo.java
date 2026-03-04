package Multilevelinheritance;


class Bank {
double getInterestRate() {y
   return 0;
}
}

//Child class SBI (overriding method)
class SBI extends Bank {
double getInterestRate() {
   return 6.5;
}
}

//Child class HDFC (overriding method)
class HDFC extends Bank {
double getInterestRate() {
   return 7.0;
}
}

//Main class
public class BankDemo {

public static void main(String[] args) {

   Bank b;

   b = new SBI();
   System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

   b = new HDFC();
   System.out.println("HDFC Interest Rate: " + b.getInterestRate() + "%");
}
}