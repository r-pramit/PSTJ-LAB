import java.util.*;

abstract class Ride {
    int distance;

    Ride(int distance) {
        this.distance = distance;
    }

    abstract int calculateFare();
}

class Bike extends Ride {
    Bike(int d) {
        super(d);
    }

    int calculateFare() {
        return distance * 5;
    }
}

class Auto extends Ride {
    Auto(int d) {
        super(d);
    }

    int calculateFare() {
        return distance * 12;
    }
}

class Cab extends Ride {
    Cab(int d) {
        super(d);
    }

    int calculateFare() {
        return distance * 12;
    }
}

public class TASK06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            int distance = sc.nextInt();

            Ride ride;

            switch (type) {
                case "Bike":
                    ride = new Bike(distance);
                    break;

                case "Auto":
                    ride = new Auto(distance);
                    break;

                case "Cab":
                    ride = new Cab(distance);
                    break;

                default:
                    throw new IllegalArgumentException("Invalid Ride Type");
            }

            System.out.println(ride.calculateFare());
        }
    }
}