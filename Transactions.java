import java.util.Timer;
import java.util.TimerTask;

public class Transactions {

    public static void withdraw(Bank account, int value, TransactionListener transaction ) {
        int time = (int) (Math.random() * ((1000 - 500) + 1)) + 500;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                account.setTotal(account.getTotal() - value);
                transaction.onComplete(account);
            }
        }, time);
    }
}
