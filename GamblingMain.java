import java.util.Random;

public class GamblingMain {

    public static final int STAKE = 100;
    public static final int BET = 1;
    public static final int WIN = 1;
    public static final int LOSE = 2;

    public static void main(String[]  args) {

        GamblingMain gamblingMain = new GamblingMain();
        gamblingMain.winOrLose();

    }

    public void winOrLose() {

        Random random = new Random();
        int amount = STAKE, winOrLose = 0;
        while(amount < 150 && amount > 50) {
            winOrLose = random.nextInt(2) + 1;
            if (winOrLose == WIN) {
                amount += BET;
            } else {
                amount -= BET;
            }
        }

        System.out.println("Gambler resigned with amount " + amount);

    }

}
