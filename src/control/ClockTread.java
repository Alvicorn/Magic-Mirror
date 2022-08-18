package control;

import javax.swing.*;
import java.time.LocalDateTime;

public class ClockTread implements Runnable{
    private Thread thread;
    private JLabel label;

    public ClockTread(JLabel label) {
        thread = new Thread(this, "Clock Thread");
        this.label = label;
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            LocalDateTime currentDateTime = LocalDateTime.now();
            String time = currentDateTime.getHour() + ":" +
                        currentDateTime.getMinute() + ":" +
                        currentDateTime.getSecond();
            label.setText(time);
        }
    }
}
