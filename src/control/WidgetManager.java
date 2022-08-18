/**
 * WidgetFrame.java
 *
 * Manager for all current widgets on the screen
 *
 * @author Alvin Tsang
 * @since August 18, 2022
 * */

package control;


import model.Widget;

import java.awt.*;
import java.util.ArrayList;

public class WidgetManager {
    private ArrayList<Widget> widgets;
    private static WidgetManager instance = null;


    private WidgetManager() {
        widgets = new ArrayList<>();
    } // end of WidgetManger()

    /**
     * Insures this class is a singleton
     * @return the instance of this class
     * */
    public static WidgetManager getInstance() {
        if (instance == null) {
            instance = new WidgetManager();
        }
        return instance;
    } // end of getInstance()

    /**
     * Add a widget to the list
     * */
    public boolean addWidget(Widget widget) {

        boolean valid = false;
        // check if the title already exists in the list
        if (widget.getIndex() == Widget.NOT_IN_LIST) {
            valid = true;
            widgets.add(widget);
            widget.setIndex(widgets.size() - 1);
        }
        return valid;
    } // end of addWidget()

    /**
     * Remove a widget from the list
     * @return true if successful, false otherwise
     * */
    public boolean removeWidget(Widget widget) {
        boolean found = false;
        if (widget.getIndex() != Widget.NOT_IN_LIST) {
            found = true;
            widgets.remove(widget.getIndex());
        }
        return found;
    } // end of removeWidget

    public boolean modifyWidget(Widget widget) {
        boolean found = false;

        if (widget.getIndex() != Widget.NOT_IN_LIST) {
            found = true;
            widgets.set(widget.getIndex(), widget);
        }
        return found;
    } // end of modifyWidget

    public Widget getWidget(int index) {
        if (index != Widget.NOT_IN_LIST &&
            index < widgets.size()) {
            return widgets.get(index);
        } else {
            throw new IllegalArgumentException("Arraylist does not contain index " + index);
        }
    } // end of getWidget()

} // end of WidgetManger.java