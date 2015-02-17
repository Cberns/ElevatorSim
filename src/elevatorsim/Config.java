
package elevatorsim;

/**
 *
 * @author Chris Berns
 */
public class Config {

    public static String title = "Elevator Sim";
    public static int numFloors = 1;
    public static int numElevators = 1;
    public static int numRiders = 0;

    public static void setNumFloors(int a) {
        numFloors = a;
    }

    public static void setNumElevators(int a) {
        numElevators = a;
    }

    public static void setNumRiders(int a) {
        numRiders = a;
    }

    public static Rider[] generateRiders() {
        Rider[] riders = new Rider[numRiders];
        for (int i = 0; i < numRiders; i++) {
            riders[i] = new Rider();
        }
        return riders;
    }

    public static Rider[] generateRiders(int startFloor) {
        Rider[] riders = new Rider[numRiders];
        for (int i = 0; i < numRiders; i++) {
            riders[i] = new Rider(startFloor);
        }
        return riders;
    }

    public static Rider[] generateRiders(int startFloor, int stopFloor) {
        Rider[] riders = new Rider[numRiders];
        for (int i = 0; i < numRiders; i++) {
            riders[i] = new Rider(startFloor, stopFloor);
        }
        return riders;
    }
    
    /*To-Do make a method that reads from a text file and uses it
    as test data. 
    */

    public static void main(String[] argc) {
        Config.numElevators = 10;
        if (Config.numElevators != 10) {
            System.out.print("Number of Elevators not set");
        }
        Config.setNumElevators(20);
        if (Config.numElevators != 20) {
            System.out.print("Number of Elevators not set");
        }
        Config.numFloors = 10;
        if (Config.numFloors != 10) {
            System.out.print("Number of Elevators not set");
        }
        Config.setNumFloors(20);
        if (Config.numFloors != 20) {
            System.out.print("Number of Floors not set");
        }
        Config.numRiders = 10;
        if (Config.numRiders != 10) {
            System.out.print("Number of Elevators not set");
        }
        Config.setNumRiders(20);
        if (Config.numRiders != 20) {
            System.out.print("Number of Floors not set");
        }
    }

}
