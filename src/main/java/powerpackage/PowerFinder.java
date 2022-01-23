package powerpackage;

public class PowerFinder {
    public static int calculatePower(int number, int power) {
        int p = 1;
        for (int i = 0; i<power; i++) {
            p *= number;
        }
        return p;
    }
}
