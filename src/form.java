import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form {
    private JPasswordField contraseniatxt;
    private JButton aceptar;
    private JTextField nombretxt;
    public JPanel mainPanel;

    public form() {
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Este es el boton aceptar");
                JFrame frame = new JFrame("Aplicacion para calcular iva");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(new form3().menu3);
                frame.setSize(800, 300);
                frame.setPreferredSize(new Dimension(800, 300));
                frame.setMaximumSize(new Dimension(800, 300));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
