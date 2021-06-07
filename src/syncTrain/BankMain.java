package syncTrain;

import com.sun.tools.javac.util.IntHashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * BankMain.java
 * Description: 银行测试的主方法
 *
 * @author Peng Shiquan
 * @date 2020/11/9
 */
public class BankMain {
    public static final int MACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 100;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        LockBank lockBank = new LockBank(MACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < MACCOUNTS; i++) {
            int fromeaccount = i;
            Runnable r = () -> {
                try {
                    while (true) {
                        int toaccount = (int) (lockBank.getCustomerNum() * Math.random());
                        double money = MAX_AMOUNT * Math.random();
                        lockBank.transfer(fromeaccount, toaccount, money);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch (InterruptedException e) {

                }
            };
            Thread t = new Thread(r);
            float []f[]  =new float[2][];
            t.start();
        }

    }
}
