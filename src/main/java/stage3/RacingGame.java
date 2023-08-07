package stage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private int numOfCars;
    private int numOfRounds;

    List<Car> cars = new ArrayList<>();

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

    public void createCars() {
        for (int i = 0; i < numOfCars; i++) {
            cars.add(new Car());
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public class Car {
        private int position;

        public Car() {
            position = 1;
        }
    }
}
