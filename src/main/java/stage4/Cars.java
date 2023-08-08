package stage4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cars {

    private final List<Car> cars;

    public static Cars newCars(String[] names) {
        Cars cars = new Cars(names.length);
        for (String name : names) {
            cars.cars.add(Car.newCar(name));
        }
        return cars;
    }

    private Cars(int size) {
        this.cars = new ArrayList<>(size);
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


    public String getWinner() {
        int max = 0;
        for (Car car : cars) {
            max = Math.max(max, car.getPosition());
        }

        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            if (car.getPosition() == max) {
                sb.append(car.getName());
                sb.append(", ");
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}
