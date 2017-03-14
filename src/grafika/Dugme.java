package grafika;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksa on 22-Dec-16.
 */
public class Dugme extends JButton {
    private Color normalna;
    private Color aktivna;

    public Dugme(){
        normalna = Color.lightGray;
        aktivna = Color.orange;
        this.setBackground(normalna);
    }

    public void promeniBoju(){
        this.setBackground(aktivna);
    }

    public void vratiBoju(){
        this.setBackground(normalna);
    }

    public Color getNormalna() {
        return normalna;
    }

    public Color getAktivna() {
        return aktivna;
    }
}
