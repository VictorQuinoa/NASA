/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nasa;

/**
 *
 * @author dam1
 */
import javax.swing.*;
import java.awt.*;

public class DibujoTrayectoria extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar una línea
        g.drawLine(50, 50, 200, 50);

        // Dibujar una esfera
        int centerX = 150;
        int centerY = 150;
        int radius = 50;
        g.setColor(Color.DARK_GRAY);
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }

}