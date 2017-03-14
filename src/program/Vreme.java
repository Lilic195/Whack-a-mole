package program;

import grafika.Prozor;

/**
 * Created by Aleksa on 22-Dec-16.
 */
public class Vreme extends Thread {
    @Override
    public void run() {
        while (Igra.vreme > 0) {
            try {
                Thread.sleep(1000);
                Prozor.time.setText("Time: " + --Igra.vreme);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Prozor.start.setEnabled(true);
    }
}
