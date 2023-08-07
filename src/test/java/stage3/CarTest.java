package stage3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @Test
    void create() {
        assertThat(Car.newCar()).isNotNull();
    }

    @ParameterizedTest
    @CsvSource(value = {"1,0", "3,0", "4,1", "9,1"})
    void move(int input, int expected) {
        Car car = Car.newCar();
        car.move(input);
        assertThat(car.getPosition()).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5})
    void toStringTest(int input) {
        Car car = Car.newCar(input);
        assertThat(car.toString()).isEqualTo("-".repeat(input));
    }
}
