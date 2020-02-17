package de.polygondev.re.gui;

import de.polygondev.re.ctrl.Main;
import de.polygondev.re.ctrl.Project;
import de.polygondev.re.ctrl.RoomObject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddObjectWindow extends JFrame {

    private JButton btnConfirm = new JButton("ADD");

    public AddObjectWindow() {
        super("New File");

        setVisible(true);
        setSize(500,500);
        setLayout(null);

        var textFields = generate("NAME", "WIDTH", "HEIGHT", "SPRITE");

        btnConfirm.setBounds(150,400,200, 30);
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name, spritePath;
                int w = 0, h = 0;

                String fName = textFields[0].getText(), fW = textFields[1].getText()
                        , fH = textFields[2].getText(), fSprite = textFields[3].getText();

                name = fName;
                if (!fW.equals("")) w = Integer.parseInt(fW);
                if (!fH.equals("")) h = Integer.parseInt(fH);
                spritePath = fSprite;

                textFields[0].getText();

                Main.project.registeredObject.put(name, new RoomObject(name,0, 0, w, h, spritePath));
            }
        });
        add(btnConfirm);

    }

    public JTextField[] generate(String... varNames) {
        JTextField[] fields = new JTextField[varNames.length];

        for (int i = 0; i<varNames.length; i++) {
            String name = varNames[i];

            JLabel lbl = new JLabel(name);
            lbl.setBounds(50, 50+i*50, 100, 40);
            add(lbl);

            JTextField jtf = new JTextField();
            jtf.setBounds(160, 50+i*50,150,40);
            add(jtf);
            fields[i] = jtf;
        }

        return fields;
    }

}
