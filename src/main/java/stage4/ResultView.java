package stage4;

public class ResultView {

    public static void printResult() {
        System.out.println("실행 결과");
    }
    public static void printCarsState(Cars cars) {
        System.out.println(cars);
    }

    public static void printWinners(Cars cars) {
        System.out.println(cars.getWinner() + "가 최종 우승했습니다.");
    }
}
