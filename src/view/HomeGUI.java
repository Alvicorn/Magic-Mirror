/**
 * HomeGUI.java
 *
 * Main screen of the program. View all apps and widgets and be able to navigate to other pages
 *
 * @author Alvin Tsang
 * @since August 18, 2022
 * */

package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HomeGUI extends JFrame {

    private final String SETTING_IMAGE_BUTTON = "../res/setting-lines.png";


    DesktopPane desktopPane;
    Container contentPane;

    JButton jb_settings;
    JPanel jp_settings;

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

        setSettings(contentPane);
    }

    /**
     * Set the initial JFrame
     * */
    private void setFrame() {
        // set the frame
        JFrame.setDefaultLookAndFeelDecorated(true);
        Dimension maxDimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(maxDimension);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // end of setFrame()

    private void setSettings(Container pane) {
        // add the settings button
        jp_settings = new JPanel();
        jp_settings.setBackground(Color.GREEN);
        jp_settings.setSize(new Dimension(50, 50));

        jb_settings = new JButton("Settings");
        jb_settings.setIcon(new ImageIcon(SETTING_IMAGE_BUTTON));
        jb_settings.addActionListener(e -> {
            System.out.println("Settings button is clicked");
        });
        jb_settings.setSize(new Dimension(100, 100));

        jp_settings.add(jb_settings);
        pane.add(jp_settings);

        validate();
    }

} // end of HomeGUI.java



