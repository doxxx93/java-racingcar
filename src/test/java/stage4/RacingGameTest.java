package stage4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    @Test
    @DisplayName("게임을 시작한다.")
    void test() {
        final String[] carNames = {"pobi", "crong", "honux"};
        final int tryCount = 5;
        RacingGame racingGame = new RacingGame(carNames, tryCount);
        assertThat(racingGame).isNotNull();
    }
}
