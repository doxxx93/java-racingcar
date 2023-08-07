package stage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputView {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int getNumOfCars() throws IOException {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return Integer.parseInt(reader.readLine());
    }

    public static int getNumOfRounds() throws IOException {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return Integer.parseInt(reader.readLine());
    }
}
