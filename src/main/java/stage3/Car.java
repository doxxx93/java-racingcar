package stage3;

public class Car {
    private int position;
    public static final int DEFAULT_POSITION = 1;

    private Car(int position) {
        this.position = position;
    }

    public static Car newCar() {
        return new Car(DEFAULT_POSITION);
    }

    public static Car newCar(int position) {
        return new Car(position);
    }

    public void move(int randomNum) {
        if (randomNum >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "-".repeat(position);
    }
}
