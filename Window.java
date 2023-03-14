package DailyPlanner;

import javax.swing.*;
import java.awt.*;


public class Window {
    protected JFrame frame;
    protected JPanel panel;
    public Window (int x, int y){
        panel = JPanel();
        frame = JFrame("Планировщик заданий");
        panel.setPreferredSize(new Dimension(x,y));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        panel.setBackground(color);
    }
}

