package program;

import grafika.Dugme;

import java.util.Random;

/**
 * Created by Aleksa on 22-Dec-16.
 */
public class Igra extends Thread {
    public static int score = 0;
    public static int vreme = 60;
    public  Dugme[] dugmad;

    public void run(){
        Random rnd = new Random();
        while (vreme > 0){
            if(vreme > 30){
                dugmad[rnd.nextInt(25)].promeniBoju();
                dugmad[rnd.nextInt(25)].promeniBoju();
                dugmad[rnd.nextInt(25)].promeniBoju();
                try {
                    sleep(1300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else if(vreme <= 30){
                dugmad[rnd.nextInt(25)].promeniBoju();
                dugmad[rnd.nextInt(25)].promeniBoju();
                dugmad[rnd.nextInt(25)].promeniBoju();
                dugmad[rnd.nextInt(25)].promeniBoju();
                dugmad[rnd.nextInt(25)].promeniBoju();
                try {
                    sleep(1700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for(int i = 0; i < 25; i++){
                dugmad[i].vratiBoju();
            }

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
