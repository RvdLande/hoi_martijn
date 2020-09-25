import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Afvink3 extends JFrame implements ActionListener {

    private JPanel panel;
    private JButton button;

    public static void main(String[] args) {
        Afvink3 frame = new Afvink3();
        frame.setSize(700, 700);
        frame.GUI();
        frame.setTitle("Boter,kaas en eitjes");
        frame.setVisible(true);
    }

    private void GUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 600));
        panel.setBackground(Color.WHITE);
        button = new JButton("maak");
        button.addActionListener(this);
        window.add(panel);
        window.add(button);
    }

    public void paintComponent(Graphics g) {
        //Lijnen van spel
        g.setColor(Color.BLACK);
        g.drawLine(200, 0, 200, 600);
        g.drawLine(400, 0,400, 600);
        g.drawLine(0, 200, 600, 200);
        g.drawLine(0,400,600,400);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics canvas;
        canvas = panel.getGraphics();
        paintComponent(canvas);

    }
}