package it.edu.iisgubbio.disegni;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class prova extends JPanel {

    
    private static final int NUM_QUAD = 100;
    private static final int LARGHEZZA_TELA = 800;
    private static final int ALTEZZA_TELA = 600;

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Random rand = new Random();
        
       
        for (int i = 0; i < NUM_QUAD; i++) {
           
            int lato = rand.nextInt(50) + 10;  // 
            int x = rand.nextInt(LARGHEZZA_TELA - lato);  
            int y = rand.nextInt(ALTEZZA_TELA - lato);  

            
            g.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));

            g.fillRect(x, y, lato, lato);
        }
    }

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quadrati Casuali");
      prova panel = new prova();
        
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(LARGHEZZA_TELA, ALTEZZA_TELA);
        frame.add(panel);
        frame.setVisible(true);
    }
}

