package abstruct;

public class interfaceabstraction {// with interface we can achieve multiple inheritance
    // in java interface is a pure abstruct class
    public static void main(String[] args) {
        Card obj = new Card();
        obj.atm();
        obj.debit();

    }
}

interface ATM {
    void atm();// here ininterface all methods are abstruct so we do not need to define it line
               // abstruct void atm()
}

interface DEBIT {
    void debit();
}

class Card implements ATM, DEBIT { // for class to class wee do extends for interface to class we do implements for
                                   // interface to interface we do extends
    public void atm() {
        System.out.println("atm");
    }

    public void debit() {
        System.out.println("debit");
    }
}