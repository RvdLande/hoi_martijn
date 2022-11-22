import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui extends JFrame implements ActionListener {
    private JTextField textField;
    private JLabel label;


    public static void main(String[] args) {
        Gui frame = new Gui();
        frame.setSize(500,500);
        frame.createGui();
        frame.setVisible(true);


    }
    private void createGui(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        label = new JLabel("Bro hier");
        window.add(label);
        textField = new JTextField("Geef input");
        window.add(textField);
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText(null);
            }
        });
        textField.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event){
        textField.setText(textField.getText());
        label.setText("hello");

    }
}