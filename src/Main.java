import javax.swing.*;
import java.awt.event.WindowStateListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame calculadora=new core();
                calculadora.setSize(600,600);
                calculadora.setLocationRelativeTo(null);
                calculadora.setVisible(true);
                calculadora.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });
    }
}