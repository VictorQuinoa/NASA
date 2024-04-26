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
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuPrincipal extends JFrame{
    private JPanel centerPanel;
    private JPanel buttonsPanel;
    private JButton createMisionButton;
    private JButton assignShipsAndCrewButton;
    private JButton viewMissionStatus;
    private JButton reportsTrayectoryButton;
  



    public MenuPrincipal(){
        setTitle("NASA");
        setVisible(true);
        setBounds(600,600,600,600);
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        add(centerPanel);
        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
        Border borde = BorderFactory.createLineBorder(Color.BLACK, 2);
        buttonsPanel.setBorder(borde);
        buttonsPanel.setBackground(Color.BLACK);
        centerPanel.add(buttonsPanel, BorderLayout.SOUTH);
     
        createMisionButton = new JButton("Crear Mision");
        createMisionButton.setPreferredSize(new Dimension(200,60));
        createMisionButton.setBackground(Color.BLUE);
        createMisionButton.setForeground(Color.WHITE);
        buttonsPanel.add(createMisionButton, BorderLayout.SOUTH);
        assignShipsAndCrewButton = new JButton("Asignar naves y tripulaciones");
        assignShipsAndCrewButton.setBackground(Color.CYAN);
        assignShipsAndCrewButton.setForeground(Color.WHITE);
        buttonsPanel.add(assignShipsAndCrewButton, BorderLayout.SOUTH);
        viewMissionStatus = new JButton("Visualizar  mision");
        viewMissionStatus.setBackground(Color.ORANGE);
        viewMissionStatus.setForeground(Color.WHITE);
        buttonsPanel.add(viewMissionStatus, BorderLayout.SOUTH);
        reportsTrayectoryButton = new JButton("Reportes y Trayectorias de las naves");
        reportsTrayectoryButton.setBackground(Color.MAGENTA);
        reportsTrayectoryButton.setForeground(Color.WHITE);
        buttonsPanel.add(reportsTrayectoryButton, BorderLayout.SOUTH);
        createMisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CrearMision();
            }
        });
        assignShipsAndCrewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NavesYTripulacion();
            }
        });
        viewMissionStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VisualizarMisiones();
            }
        });
        reportsTrayectoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ReportesYTrayectoria();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }




}
