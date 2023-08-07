package stage3;

import java.util.Random;

public class RacingGame {
    private final int numOfRounds;
    private final Cars cars;

    public RacingGame(int numOfCars, int numOfRounds) {
        this.numOfRounds = numOfRounds;
        this.cars = Cars.newCars(numOfCars);
        playGame();
    }

    private void playGame() {
        ResultView.printResult();
        for (int i = 0; i < numOfRounds; i++) {
            playRound();
            ResultView.printCarsState(cars);
        }
    }

    private void playRound() {
        cars.move(new Random());
    }

    public int getNumOfCars() {
        return cars.getNumOfCars();
    }
}
