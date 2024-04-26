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

public class VerTrayectoria extends JFrame {

    public VerTrayectoria(){

        setTitle("Trayectoria de la nave");
        setVisible(true);
        setBounds(600,600,600,600);
        DibujoTrayectoria miDibujo = new DibujoTrayectoria();
        add(miDibujo);
    }
}