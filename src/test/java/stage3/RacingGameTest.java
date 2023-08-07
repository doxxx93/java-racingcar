package stage3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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


}
