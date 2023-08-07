package stage3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    RacingGame racingGame;

    @BeforeEach
    void setUp() {
        racingGame = new RacingGame();
    }

    @Test
    @DisplayName("게임을 시작한다.")
    void test() {
        assertThat(racingGame).isNotNull();
    }

    @Test
    @DisplayName("입력 받은 자동차의 수와 이동 횟수를 반환한다.")
    void testGetInput() {
        racingGame.getInput(3, 5);
        assertThat(racingGame.getNumOfCars()).isEqualTo(3);
        assertThat(racingGame.getNumOfRounds()).isEqualTo(5);
    }

    @Test
    @DisplayName("입력 받은 자동차의 수만큼 자동차를 생성한다.")
    void testCreateCars() {
        racingGame.getInput(3, 5);
        racingGame.createCars();
        assertThat(racingGame.getCars().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차를 이동시킨다.")
    void testMoveCars() {
        racingGame.getInput(3, 5);
        racingGame.createCars();
        racingGame.moveCars();
        assertThat(racingGame.getCars()).allMatch(car -> car.getPosition() >= 1 && car.getPosition() <= 6);
    }

    @ParameterizedTest
    @DisplayName("자동차가 이동하거나 움직이지 않는다.")
    @CsvSource(value = {"0:1", "3:1", "4:2", "9:2"}, delimiter = ':')
    void testMove(int random, int position) {
        RacingGame.Car car = new RacingGame.Car();
        car.move(random);
        assertThat(car.getPosition()).isEqualTo(position);
    }
}
