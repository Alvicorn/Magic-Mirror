/**
 * DesktopPane.java
 *
 * Show all the info for the desktop pane
 *
 * @author Alvin Tsang
 * @since August 18, 2022
 * */

package view;

import control.ClockTread;
import control.WidgetManager;
import model.Widget;

import javax.swing.*;
import java.awt.*;


public class DesktopPane extends JDesktopPane {

    WidgetManager widgetManager;


    public DesktopPane() {
        widgetManager = WidgetManager.getInstance();
    }


    public void display(DesktopPane dp) {
        addWidgetsForTesting();

        for(int i = 0; i < widgetManager.getWidgetListSize(); i++) {
            JInternalFrame frame = new JInternalFrame("",  true,
                    true, true, true);

            frame.setBounds(widgetManager.getWidget(i).getFrameBounds());
            Container container = frame.getContentPane();
            container.add(widgetManager.getWidget(i).getComponent());
            dp.add(frame);
            frame.setVisible(true);
        }
    }

    private void addWidgetsForTesting() {
        // panel 1
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(Color.BLACK);
        JLabel clock = new JLabel("Clock", JLabel.CENTER);
        clock.setForeground(Color.WHITE);
        clock.setFont(new Font("Arial Black", Font.BOLD, 25));
        panel1.add(clock);
        ClockTread ct = new ClockTread(clock);
        Widget widget1 = new Widget(panel1, "panel 1",
                new Rectangle(30, 30, 250, 85));

        // panel 2
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        Widget widget2 = new Widget(panel2, "panel 2",
                new Rectangle(30, 110, 250, 85));

        widgetManager.addWidget(widget1);
        widgetManager.addWidget(widget2);
    }

}

