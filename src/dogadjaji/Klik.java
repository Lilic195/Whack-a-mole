package dogadjaji;

import grafika.Dugme;
import grafika.Prozor;
import program.Igra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksa on 22-Dec-16.
 */
public class Klik implements ActionListener {
    private Dugme dugme;

    public Klik(Dugme dugme){
        this.dugme = dugme;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(dugme.getBackground() == dugme.getAktivna()){
            Igra.score += 3;
            dugme.vratiBoju();
        }else{
            Igra.score --;
        }
        Prozor.score.setText("Score: " + Igra.score);
    }
}
