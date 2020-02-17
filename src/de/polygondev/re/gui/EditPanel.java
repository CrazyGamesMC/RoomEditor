package de.polygondev.re.gui;

import javax.swing.*;
import java.awt.*;

public class EditPanel extends JPanel {

    public EditPanel() {

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0,0,getWidth(),getHeight());


    }
}
