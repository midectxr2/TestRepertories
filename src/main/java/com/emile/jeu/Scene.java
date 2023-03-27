package com.emile.jeu;

import java.awt.*;

import javax.swing.*;

public class Scene extends JPanel {

    private ImageIcon icoFond;
    private Image imgFond1;

    private ImageIcon icoMario;
    private Image imgMario;

    private int xFond1;
    public Scene(){
        super();

        this.xFond1 = -50;

        icoFond = new ImageIcon("src/main/resources/fondEcran.png");
        this.imgFond1 = this.icoFond.getImage();
        icoMario = new ImageIcon("src/main/resources/marioMarcheDroite.png");
        this.imgMario = this.icoMario.getImage();
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics g2 = (Graphics2D)g;

        g2.drawImage(this.imgFond1, this.xFond1, 0, null);
        g2.drawImage(imgMario, 300, 245, null);
    }
}
