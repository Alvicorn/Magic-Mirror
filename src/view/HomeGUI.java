/**
 * HomeGUI.java
 *
 * Main screen of the program. View all apps and widgets and be able to navigate to other pages
 *
 * @author Alvin Tsang
 * @since August 18, 2022
 * */

package view;

import javax.swing.*;
import java.awt.*;

public class HomeGUI extends JFrame {

    DesktopPane desktopPane;
    Container contentPane;

    public HomeGUI() {
        setFrame();
        setDesktopPane();
    }



    /**
     * Set the desktop view and its internal components
     * */
    private void setDesktopPane() {
        desktopPane = new DesktopPane();
        contentPane = getContentPane();
        contentPane.add(desktopPane, BorderLayout.CENTER);
        desktopPane.display(desktopPane);
        desktopPane.setBackground(Color.BLACK);
    }

    /**
     * Set the initial JFrame
     * */
    private void setFrame() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Dimension maxDimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(maxDimension);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // end of setFrame()


} // end of HomeGUI.java



