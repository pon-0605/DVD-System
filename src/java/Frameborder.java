
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Frameborder extends JFrame {

    Frameborder(String title) {
        JLabel label2 = new JLabel(title);
        label2.setPreferredSize(new Dimension(200, 50));
        EtchedBorder border = new EtchedBorder(EtchedBorder.RAISED, Color.white, Color.black);
        label2.setBorder(border);

    }
}
