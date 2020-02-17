package de.polygondev.re.gui;

import de.polygondev.re.ctrl.Main;
import de.polygondev.re.ctrl.Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewProjectWindow extends JFrame {

    private JButton btnConfirm = new JButton("CREATE");

    public NewProjectWindow() {
        super("New File");

        setVisible(true);
        setSize(500,500);
        setLayout(null);

        var textFields = generate("Name");

        btnConfirm.setBounds(150,400,200, 30);
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.project = new Project(textFields[0].getText());
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
