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
        int winOrLose = random.nextInt(2) + 1;
        if(winOrLose == WIN) {
            System.out.println("Gambler won $1");
        } else {
            System.out.println("Gambler lost $1");
        }

    }

}
