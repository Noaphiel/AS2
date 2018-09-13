import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The code is documentation enough.
 *
 * @author Sven
 */
public class SimpleGUI extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel panel = new JPanel();
    private JButton calculate = new JButton("calculate");
    private JTextField z1 = new JTextField();
    private JTextField n1 = new JTextField();
    private JTextField z2 = new JTextField();
    private JTextField n2 = new JTextField();
    private JTextField operation = new JTextField();

    public SimpleGUI() {

        this.setLayout(new BorderLayout());

        calculate.addActionListener(this);
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("  Frac1 Zähler"));
        panel.add(z1);
        panel.add(new JLabel("  Frac1 Nenner"));
        panel.add(n1);
        panel.add(new JLabel("  Frac2 Zähler"));
        panel.add(z2);
        panel.add(new JLabel("  Frac2 Nenner"));
        panel.add(n2);
        panel.add(new JLabel("  Operation"));
        panel.add(operation);
        this.add(calculate, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.calculate) {

            Fraction f1 = new Fraction(Integer.parseInt(z1.getText()), Integer.parseInt(n1.getText()));
            Fraction f2 = new Fraction(Integer.parseInt(z2.getText()), Integer.parseInt(n2.getText()));

            if (operation.getText().equals("+")) {
                System.out.println(f1.add(f2));
            } else if (operation.getText().equals("-")) {
                System.out.println(f1.sub(f2));
            } else if (operation.getText().equals("*")) {
                System.out.println(f1.mul(f2));
            } else if (operation.getText().equals("/")) {
                System.out.println(f1.div(f2));
            }
        }
    }

    public static void main(String[] args) {

        SimpleGUI a = new SimpleGUI();

        a.setSize(400, 300);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
    }
}