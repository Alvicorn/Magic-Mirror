/**
 * Widget.java
 *
 * Contains information about the JPanel for a widget as well as other
 * fields for placement and management
 *
 * @author Alvin Tsang
 * @since August 18, 2022
 * */

package model;

import java.awt.*;

public class Widget {

    public static final int NOT_IN_LIST = -1;
    private Component component;
    private String widgetName;

    private Dimension size;
    private Point lastPosition;

    private int index;

    /**
     * Parameterized constructor
     * */
    public Widget(Component component, String widgetName) {
        this.component = component;
        this.widgetName = widgetName;
        this.size = component.getSize();
        this.lastPosition = component.getLocation();
        this.index = NOT_IN_LIST;
    } // end of Widget()


    public Component getComponent() {
        return component;
    }

    public String getWidgetName() {
        return widgetName;
    }

    public Dimension getSize() {
        return size;
    }

    public Point getLastPosition() {
        return lastPosition;
    }

    public int getIndex() {
        return index;
    }


    public void setIndex(int index) {
        this.index = index;
    }

    public boolean inWidgetList() {
        return index > NOT_IN_LIST;
    }

} // end of Widget.java
