package stage3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    @Test
    @DisplayName("게임을 시작한다.")
    void test() {
        RacingGame racingGame = new RacingGame(3, 5);
        assertThat(racingGame).isNotNull();
    }

    @Test
    @DisplayName("입력 받은 자동차의 수만큼 자동차를 생성한다.")
    void testCreateCars() {
        RacingGame racingGame = new RacingGame(3, 5);
        assertThat(racingGame.getNumOfCars()).isEqualTo(3);
    }

    @ParameterizedTest
    @DisplayName("자동차가 이동하거나 움직이지 않는다.")
    @CsvSource(value = {"0:0", "3:0", "4:1", "9:1"}, delimiter = ':')
    void testMove(int random, int position) {
        Car car = Car.newCar();
        car.move(random);
        assertThat(car.getPosition()).isEqualTo(position);
    }

    @ParameterizedTest
    @DisplayName("자동차의 상태를 출력한다.")
    @CsvSource(value = {"0:0", "1:0", "3:0", "4:1", "9:1"}, delimiter = ':')
    void testPrint(int random, int expected) {
        Car car = Car.newCar();
        car.move(random);
        assertThat(car.toString()).isEqualTo("-".repeat(expected));
    }
}
