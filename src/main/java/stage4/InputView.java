package stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputView {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String[] getCarNames() throws IOException {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return reader.readLine().split(",");
    }

    public static int getNumOfRounds() throws IOException {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return Integer.parseInt(reader.readLine());
    }
}
