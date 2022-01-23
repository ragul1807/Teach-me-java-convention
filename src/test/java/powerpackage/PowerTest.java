package powerpackage;
import org.junit.Test;

public class PowerTest {
    @Test
    public void one_raised_to_one_is_one() {
        int number = 1;
        int power = 1;
        int expectedValue = 1;
        assert PowerFinder.calculatePower(number, power) == expectedValue;
    }

    @Test
    public void one_raised_to_two_is_two() {
        int number = 2;
        int power = 1;
        int expectedValue = 2;
        assert PowerFinder.calculatePower(number, power) == expectedValue;
    }

    @Test
    public void two_raised_to_two_is_four() {
        int number = 2;
        int power = 2;
        int expectedValue = 4;
        assert PowerFinder.calculatePower(number, power) == expectedValue;
    }

    @Test
    public void three_raised_to_two_is_nine() {
        int number = 3;
        int power = 2;
        int expectedValue = 9;
        assert PowerFinder.calculatePower(number, power) == expectedValue;
    }
}
