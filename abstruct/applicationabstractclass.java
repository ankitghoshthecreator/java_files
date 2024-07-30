package abstruct;

//here we are a bank where we have three feature atm credit and debit what to do if our customer wan to acess ony one and the other we need to make private
public class applicationabstractclass {
    public static void main(String[] args) {

    }
}

class card extends atm {
    public void atm() {
        System.out.println("atm");

    }

    public void credit() {
        System.out.println("credit");
    }

    public void debit() {
        System.out.println("debit");
    }

}

abstract class atm {
    abstract void atm();
}

abstract class credit {
    abstract void credit();
}

abstract class debit {
    abstract void debit();
}
// but here if customer want 2 servicea at a time we cann't do with this because
// dosen't support multiple inheritance, so we have something called interface