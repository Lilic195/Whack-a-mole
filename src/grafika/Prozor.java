package grafika;

import dogadjaji.Klik;
import program.Igra;
import program.Vreme;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Aleksa on 22-Dec-16.
 */
public class Prozor extends JFrame {
    Dugme [] dugmad = new Dugme[25];
    public static JButton start;
    public static JLabel score;
    public static JLabel time;

    public Prozor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(310,400);
        setLayout(null);
        Dugme dugme = new Dugme();
        dugme.setBounds(50,50,120,30);

        dodajDugmad();

        setVisible(true);
    }

    public void dodajDugmad(){
        int x = 20;
        int y = 20;
        for(int i = 0; i < 25 ; i++){

            if(i != 0 && i % 5 == 0){
                x = 20;
                y += 50;
            }else if( i != 0){
                x = x + 50;
            }
            dugmad[i] = new Dugme();
            dugmad[i].setBounds(x, y,50,50);
            dugmad[i].addActionListener(new Klik(dugmad[i]));
            getContentPane().add(dugmad[i]);
        }

        start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time.setText("Time: " + 60);
                score.setText("Score: " + 0);
                Igra.vreme = 60;
                Igra igra = new Igra();
                Vreme vreme = new Vreme();
                igra.dugmad = dugmad;
                igra.start();
                vreme.start();
                start.setEnabled(false);
            }
        });
        start.setBounds(20, 290, 100,30);
        getContentPane().add(start);
        score = new JLabel("Score: ");
        time = new JLabel("Time: 60");
        score.setBounds(140,280,150,30);
        time.setBounds(140,300,150,30);
        add(score);
        add(time);

    }
}
