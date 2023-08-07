package stage3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {

    private final List<Car> cars;

    public static Cars newCars(int size) {
        return new Cars(size);
    }
    private Cars(int size) {
        this.cars = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            cars.add(Car.newCar());
        }
    }

    public void move(Random random) {
        for (Car car : cars) {
            car.move(random.nextInt(10));
        }
    }

    public int getNumOfCars() {
        return cars.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
