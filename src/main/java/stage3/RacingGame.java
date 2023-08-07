package stage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RacingGame {

    private int numOfCars;
    private int numOfRounds;

    public static void main(String[] args) {
        try {
            new RacingGame().start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() throws IOException {
        int numOfCars;
        int numOfRounds;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("자동차 대수는 몇 대 인가요?");
        numOfCars = Integer.parseInt(br.readLine());
        System.out.println("시도할 회수는 몇 회 인가요?");
        numOfRounds = Integer.parseInt(br.readLine());
        getInput(numOfCars, numOfRounds);
    }

    public RacingGame() {
        numOfCars = 0;
        numOfRounds = 0;
    }

    public void getInput(int numOfCars, int numOfRounds) {
        this.numOfCars = numOfCars;
        this.numOfRounds = numOfRounds;
    }

    public int getNumOfCars() {
        return numOfCars;
    }

    public int getNumOfRounds() {
        return numOfRounds;
    }
}
