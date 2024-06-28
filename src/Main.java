import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion para calcular iva");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new form().mainPanel);
        frame.setSize(1024, 768);
        frame.setPreferredSize(new Dimension(1024, 768));
        frame.setMaximumSize(new Dimension(1024, 768));
        frame.pack();
        frame.setVisible(true);
    }
}