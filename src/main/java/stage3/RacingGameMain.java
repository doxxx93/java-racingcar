package stage3;

import java.io.IOException;

public class RacingGameMain {
    public static void main(String[] args) {
        try {
            new RacingGame(InputView.getNumOfCars(), InputView.getNumOfRounds());
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
