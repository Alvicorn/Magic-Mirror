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
                    true, false, false);

            frame.setBounds(widgetManager.getWidget(i).getFrameBounds());
            Container container = frame.getContentPane();
            container.add(widgetManager.getWidget(i).getComponent());
            dp.add(frame);
            frame.setVisible(true);
        }
    }

    private void addWidgetsForTesting() {
        createClock();

        // panel 2
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        Widget widget2 = new Widget(panel2, "panel 2",
                new Rectangle(30, 150, 250, 85));


        widgetManager.addWidget(widget2);
    }


    private void createClock() {
        JPanel clockPanel = new JPanel();

        // set panel properties
        clockPanel.setLayout(new BoxLayout(clockPanel, BoxLayout.Y_AXIS));
        clockPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        clockPanel.setBackground(Color.BLACK);

        // attach the clock thread to the panel
        ClockTread ct = new ClockTread(clockPanel);

        // place the clock onto the desktop
        Widget clockWidget = new Widget(clockPanel, "Clock panel",
                new Rectangle(30, 30, 500, 100));
        widgetManager.addWidget(clockWidget);

    }



} // end of DesktopPane.java

