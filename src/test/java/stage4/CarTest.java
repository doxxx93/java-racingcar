package stage4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @Test
    void create() {
    }

    @ParameterizedTest
    @CsvSource(value = {"1,0", "3,0", "4,1", "9,1"})
    void move(int input, int expected) {
        final String name = "pobi";
        Car car = Car.newCar(name);
        car.move(input);
        assertThat(car.getPosition()).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5})
    void toStringTest(int input) {
        final String name = "pobi";
        Car car = Car.newCar(name, input);
        assertThat(car.toString()).isEqualTo(name + " : " + "-".repeat(input));
    }
}
