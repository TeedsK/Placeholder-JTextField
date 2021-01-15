import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class example {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel background = new JPanel();
        background.setBackground(new Color(0,0,0));
        background.setLayout(new BoxLayout(background, BoxLayout.X_AXIS));
        frame.setMinimumSize(new Dimension(500,500));
        frame.add(new PlaceholderTextField("test"));
        frame.add(background);
        background.add(Box.createHorizontalGlue());
        PlaceholderTextField field = new PlaceholderTextField("Placeholder Text");
        field.setMaximumSize(new Dimension(300,40));
        field.setPreferredSize(new Dimension(300,400));
        background.add(field);
        background.add(Box.createHorizontalGlue());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
