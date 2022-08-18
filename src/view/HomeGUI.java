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

public class HomeGUI {

    private JFrame homeFrame;

    public HomeGUI() {
        setHomeFrame();


    } // end of HomeGUI()


    private void setHomeFrame() {
        homeFrame = new JFrame();
        Dimension maxDimension = Toolkit.getDefaultToolkit().getScreenSize();
        homeFrame.setSize(maxDimension);
        homeFrame.setResizable(false);
        homeFrame.getContentPane().setBackground(Color.BLACK);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setVisible(true);
    }

} // end of HomeGUI.java
