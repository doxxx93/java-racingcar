package stage4;

import java.io.IOException;

public class RacingGameMain {
    public static void main(String[] args) {
        try {
            new RacingGame(InputView.getCarNames(), InputView.getNumOfRounds());
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
