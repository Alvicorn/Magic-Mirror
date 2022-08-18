/**
 * DesktopPane.java
 *
 * Show all the info for the desktop pane
 *
 * @author Alvin Tsang
 * @since August 18, 2022
 * */

package view;

import control.WidgetManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DesktopPane extends JDesktopPane {

    WidgetManager widgetManager;

    int numFrames = 3,  x = 30, y = 30;

    public DesktopPane() {
        widgetManager = WidgetManager.getInstance();
    }


    public void display(DesktopPane dp)
    {
        for(int  i = 0; i < numFrames ; ++i )
        {
            JInternalFrame frame = new JInternalFrame("",  true, true, true, true);

            frame.setBounds(x, y, 250, 85);
            Container c1 = frame.getContentPane() ;
            c1.add(new JLabel("I love my country"));
            dp.add(frame);
            frame.setVisible(true);
            y += 85;
        }
    }

}

