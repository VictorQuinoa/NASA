/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nasa;

/**
 *
 * @author dam1
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReportesYTrayectoria extends JFrame {

    private JPanel centerPanel;
    private JPanel generateReportPanel;
    private JPanel viewShipReportPanel;
    private JButton generateReportButton;
    private JButton viewShipReport;
    private JButton shipTrayectoryButton;
    private JLabel shipStatusIndicator;
    private JTextField shipStatusText;
    private JProgressBar progressTarget;

    public ReportesYTrayectoria() throws IOException {
        setTitle("Reportes y progresos");
        setVisible(true);
        setBounds(500,500,600,600);
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        add(centerPanel);
        generateReportButton = new JButton("Generar reporte");
        generateReportButton.setBackground(Color.GREEN);
        generateReportButton.setForeground(Color.WHITE);
        centerPanel.add(generateReportButton, BorderLayout.EAST);
        viewShipReport = new JButton("Ver reportes de misiones");
        viewShipReport.setBackground(Color.ORANGE);
        viewShipReport.setForeground(Color.WHITE);
        centerPanel.add(viewShipReport, BorderLayout.WEST);
        shipTrayectoryButton = new JButton("Trayectoria de las naves");
        shipTrayectoryButton.setBackground(Color.BLUE);
        shipTrayectoryButton.setForeground(Color.WHITE);
        centerPanel.add(shipTrayectoryButton, BorderLayout.SOUTH);
        BufferedImage image = ImageIO.read(new File("naves.jpg"));
        ImageIcon imageIcon = new ImageIcon("naves.jpg");
        Image scaledImage = image.getScaledInstance(1280, 1000, Image.SCALE_SMOOTH);


        imageIcon = new ImageIcon(scaledImage);

        JLabel label = new JLabel(imageIcon);
        centerPanel.add(label, BorderLayout.CENTER);



    }

}