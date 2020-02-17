package de.polygondev.re.gui;

import de.polygondev.re.ctrl.Main;
import de.polygondev.re.ctrl.RoomObject;

import javax.swing.*;
import java.awt.*;

public class ObjectPickerPanel extends JPanel {

    private int selected = 0;

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(),getHeight());

        if (Main.project != null) {
            for (int i = 0; i < Main.project.registeredObject.size(); i++) {
                RoomObject obj = (RoomObject) Main.project.registeredObject.values().toArray()[i];
                g.drawString(obj.name, 10, 10 + (10 + 10) * i);
            }
        }

    }

}
