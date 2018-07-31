/**
 * Created by OYurchuk on 17.07.2018.
 */
public final class Passenger {

    private int checkedBags;

    public int getCheckedBags() {return checkedBags;}
    public void setCheckedBags(int checkedBags) {this.checkedBags = checkedBags;}

    private int freeBags;

    private double perBagFee;

    public Passenger() {};

    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    public Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
