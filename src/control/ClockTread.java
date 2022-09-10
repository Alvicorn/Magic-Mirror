/**
 * ClockTread.java
 *
 * Thread that will run manage the time of the current machine
 * */

package control;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class ClockTread implements Runnable {
    private Thread thread;

    // for the GUI
    private JPanel panel;
    private JLabel time;
    private JLabel date;


    public ClockTread(JPanel panel) {
        thread = new Thread(this, "Clock Thread");

        // setting up the GUI
        this.panel = panel;
        setUpGUI();

        thread.start();
    } // end of ClockTread()


    /**
     * Style and format the GUI for the clock
     * */
    private void setUpGUI() {
        this.time = new JLabel("time", JLabel.CENTER);
        this.time.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        this.time.setForeground(Color.WHITE);
        this.time.setFont(new Font("Arial Black", Font.BOLD, 25));

        this.date = new JLabel("date", JLabel.CENTER);
        this.date.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        this.date.setForeground(Color.WHITE);
        this.date.setFont(new Font("Arial Black", Font.BOLD, 15));
    } // end of setUpGUI()


    /**
     * Execute the tread
     * */
    @Override
    public void run() {
        while (true) {
             // calculate date and time
            LocalDateTime currentDateTime = LocalDateTime.now();

            String hour = String.valueOf(currentDateTime.getHour());
            String minute = String.valueOf(currentDateTime.getMinute());
            String second = String.valueOf(currentDateTime.getSecond());
            String AMorPM = "AM";
            // format the time
            int hour_int = Integer.parseInt(hour);
            if (hour_int > 13) { // time between 1300 hrs and 2300 hrs
                hour_int -= 12;
                hour = String.valueOf(hour_int);
                AMorPM = "PM";
            } else if (hour_int == 12) { // time is 1200 hrs
                AMorPM = "PM";
            } else if (hour_int == 0) { // time is 0000 hrs
                hour = "12";
                AMorPM = "AM";
            }
            if (hour.length() == 1) {
                hour = "0" + hour;
            }
            if (minute.length() == 1) {
                minute = "0" + minute;
            }
            if (second.length() == 1) {
                second = "0" + second;
            }
            // format date
            String dayOfTheWeek = String.valueOf(currentDateTime.getDayOfWeek());
            String month = String.valueOf(currentDateTime.getMonth());
            String dayOfTheMonth = String.valueOf(currentDateTime.getDayOfMonth());
            String year = String.valueOf(currentDateTime.getYear());
            if (dayOfTheMonth.length() == 1) {
                dayOfTheMonth = "0" + dayOfTheMonth;
            }

            this.time.setText(hour + ":" + minute + ":" + second + " " + AMorPM);
            this.date.setText(dayOfTheWeek + ", " + month + " " + dayOfTheMonth + ", " + year);
            panel.add(this.time);
            panel.add(this.date);
        }
    } // end of run()

} // end of ClockThread.java
