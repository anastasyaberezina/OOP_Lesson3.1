package DailyPlanner;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import ru.anafro.Window.window;


public class Main {
    public static final Window WINDOW = new Window (700, 500, new Color(70, 76, 92));
    public static final JPanel ACTION_PANEL = new JPanel();
    public static final JLabel TITLE = new JLabel("Планировщик");
    public static final JLabel TITLE1 = new JLabel("Текущие дела");
    public static final ArrayList<JLabel> TASK_LIST = new ArrayList<>();
    public static void main(String[] args) {
        @Override
        public void run() {
            TITLE.setPreferredSize(new Dimension(WINDOW.getPanel().getWidth(), 60));
            TITLE.setForeground(Color.WHITE);
            TITLE.setFont(new Font("Century Gothic", Font.BOLD, 45));
            TITLE.setHorizontalAlignment(SwingConstants.CENTER);
            TITLE.setVerticalAlignment(SwingConstants.TOP);
            WINDOW.getPanel().add(TITLE);
            ACTION_PANEL.setPreferredSize(new Dimension(WINDOW.getPanel().getWidth(), WINDOW.getPanel().getHeight() - TITLE.getHeight() - 5));
            WINDOW.getPanel().add(ACTION_PANEL);

            //TITLE1.setPreferredSize(new Dimension(WINDOW.getPanel().getWidth(), 20));
            TITLE1.setForeground(Color.BLACK);
            TITLE1.setFont(new Font("Century Gothic", 0, 15));
            TITLE1.setVerticalAlignment(SwingConstants.TOP);
            ACTION_PANEL.add(TITLE1);
            ACTION_PANEL.repaint();
        }
    }}
