import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Afvink2 extends JFrame implements ActionListener {

    private JButton Button;
    private JTextField Xas, Yas;
    private JPanel panel;

    public static void main(String[] args) {
        Afvink2 frame = new Afvink2();
        frame.setSize(700,700);
        frame.GUI();
        frame.setTitle("Watermolecuul BRUHHH Ricardo van der Lande");
        frame.setVisible(true);
    }
    //de GUI maken
    private void GUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(600,600));
        panel.setBackground(Color.WHITE);
        Yas = new JTextField("Y as input");
        Xas = new JTextField("X as input");
        Button = new JButton("maak");
        Button.addActionListener(this);
        window.add(panel);
        window.add(Yas);
        window.add(Xas);
        window.add(Button);
    }
    // Het verven van het molecuul
    public void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        //cleared de canvas zodat er opnieuw getekent kan worden
        g.clearRect(0, 0, 400,400);
        //grootte
        int WWater = 50;
        int HWater = 50;
        int WLucht = 80;
        int HLucht = 80;

        //positie
        int x = Integer.parseInt(Xas.getText());
        int y = Integer.parseInt(Yas.getText());

        //centrum water
        int CentrumxWater1 = x + 50;
        int CentrumxWater2 = x - 50;
        int CentrumyWater = y + 67;

        //x,y voor de oval
        int xLuchtO = x - (WLucht / 2);
        int yLuchtO = y - (HLucht / 2);
        int xWaterO1 = CentrumxWater1 - (WWater / 2);
        int xWaterO2 = CentrumxWater2 - (WWater / 2);
        int yWaterO = CentrumyWater - (HWater / 2);

        //LIJNTJES BRUHHHH
        g.setColor(Color.BLACK);
        g.drawLine(x, y, CentrumxWater1, CentrumyWater);
        g.drawLine(x, y, CentrumxWater2, CentrumyWater);

        //verven van DE WATER NUMERO UNO
        g.setColor(Color.BLUE);
        g.drawOval(xWaterO1, yWaterO, WWater, HWater);
        g.fillOval(xWaterO1, yWaterO, WWater, HWater);
        // NUMERO DOS
        g.setColor(Color.BLUE);
        g.drawOval(xWaterO2, yWaterO, WWater, HWater);
        g.fillOval(xWaterO2, yWaterO, WWater, HWater);

        //Verven van LUCHT
        g.setColor(Color.MAGENTA);
        g.drawOval(xLuchtO, yLuchtO, WLucht, HLucht);
        g.fillOval(xLuchtO, yLuchtO, WLucht, HLucht);

    //Het Knoppeke
    }
    public void actionPerformed(ActionEvent event){
        Graphics canvas;
        canvas = panel.getGraphics();
        paintComponent(canvas);
    }
}
