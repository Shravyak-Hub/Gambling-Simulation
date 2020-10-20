import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GamblingMain {

    public static final int STAKE = 100;
    public static final int BET = 1;
    public static final int WIN = 1;
    public static final int LOSE = 2;
    int totalAmount = 0, daysWon = 0, daysLost = 0;
    ArrayList winsOrLosses = new ArrayList();

    public static void main(String[]  args) {

        GamblingMain gamblingMain = new GamblingMain();
        gamblingMain.winOrLose();
        gamblingMain.totalWinOrLosses();
        gamblingMain.luckyOrUnluckyDay();

    }

    public void winOrLose() {

        Random random = new Random();
        int amount = 0, winOrLose = 0, day = 1;
        while(day <= 20) {
            while (amount < 50 && amount > -50) {
                winOrLose = random.nextInt(2) + 1;
                if (winOrLose == WIN) {
                    amount += BET;
                } else {
                    amount -= BET;
                }
            }

            totalAmount += amount;

            if(amount == 50) {
                System.out.println("Gambler won " + amount);
                daysWon++;
            } else {
                System.out.println("Gambler lost " + amount);
                daysLost++;
            }

            System.out.println("Gambler resigned day " + day + " with amount " + totalAmount);
            winsOrLosses.add(totalAmount);
            day++;
            amount = 0;

        }

    }

    public void totalWinOrLosses() {
        if (totalAmount > 0) {
            System.out.println("After 20 days, player won " + totalAmount);
        } else {
            System.out.println("After 20 days, player lost " + totalAmount);

        }
        System.out.println("Total days lost " + daysLost);
        System.out.println("Total days won " + daysWon);
    }

    public void luckyOrUnluckyDay() {
        int luckyDay = winsOrLosses.indexOf(Collections.max(winsOrLosses)) + 1;
        int unluckyDay = winsOrLosses.indexOf(Collections.min(winsOrLosses)) + 1;
        System.out.println("Lucky day is day " + luckyDay);
        System.out.println("Unlucky day is day " + unluckyDay);

    }

}
