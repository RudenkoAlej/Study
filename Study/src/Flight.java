import java.util.Objects;

/**
 * Created by OYurchuk on 13.07.2018.
 */
public class Flight {

    private int passengers;
    private int seats = 150;
    private int flightNumber;
    private boolean[] isSeatsAvailable;
    private char flightClass;
    private int maxCarryOns = seats *2;
    private  int totalCarryOns;

//    @Override
//    public boolean equals(Objects o) {
//        if (super.equals(o))
//            return true;
//        if (!(o instanceof Flight))
//            return false;
//        Flight other = (Flight) o;
//        return
//                flightNumber == other.flightNumber &&
//                        flightClass == other.flightClass;
//    }


    public int getPassengers() {
        return passengers;
    }

    {
        isSeatsAvailable = new boolean[seats];

        for(int i = 0; i < seats; i++) {
            isSeatsAvailable[i] = true;
        }
    }

    public Flight() {}

    public  Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }

    public void add1Passenger() {
        if (hasSeating()) {
            this.passengers += 1;
        } else {
            handleToMany();
        }
    }


    public void add1Passenger(int bags) {
        if(hasSeating()) {
            add1Passenger();
            totalCarryOns += bags;
        }
    }

    public void add1Passenger(Passenger p) {
        if(hasSeating()) {
            add1Passenger(p.getCheckedBags());
        }
    }

    public void add1Passenger(int bags, int carryOns) {
        if(hasSeating() && hasCarryOnSpace(carryOns)) {
            add1Passenger(bags);
            totalCarryOns += carryOns;
        }
    }

    public void addPassengers(Passenger... list) {
        if(hasSeating(list.length)) {
            passengers += list.length;
            for(Passenger passenger : list) {
                totalCarryOns += passenger.getCheckedBags();
            }
        } else  {
            handleToMany();
        }
    }

    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
    }

    private void handleToMany() {
        System.out.println("Not enough seats");
    }

    private boolean hasSeating() {
        return passengers < this.seats;
    }

    private boolean hasSeating(int count) {
        return passengers + count <= seats;
    }

    private boolean hasCarryOnSpace(int carryOn) {
        return totalCarryOns + carryOn <=maxCarryOns;
    }

    public  boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= this.seats;
    }

    public Flight createTwoWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        return newFlight;
    }
}
