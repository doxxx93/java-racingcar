package stage4;

public class Car {
    private final String name;
    private int position;
    public static final int DEFAULT_POSITION = 0;

    private Car(final String name, final int position) {
        this.name = name;
        this.position = position;
    }

    public static Car newCar(final String name) {
        return new Car(name, DEFAULT_POSITION);
    }

    public static Car newCar(final String name, final int position) {
        return new Car(name, position);
    }

    public void move(int randomNum) {
        if (randomNum >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : "+ "-".repeat(position);
    }
}
