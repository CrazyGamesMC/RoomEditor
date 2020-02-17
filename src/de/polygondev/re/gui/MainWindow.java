package de.polygondev.re.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private EditPanel editPanel = new EditPanel();

    private ObjectPickerPanel objectPickerPanel = new ObjectPickerPanel();

    private JMenuBar menuBar = new JMenuBar();

    private JMenu menuFile = new JMenu("File");
    private JMenu menuObject = new JMenu("Objects");

    private JMenuItem fileNew = new JMenuItem("New");
    private JMenuItem fileSave = new JMenuItem("Save");
    private JMenuItem fileLoad = new JMenuItem("Load");

    private JMenuItem objectAdd = new JMenuItem("Add");

    public MainWindow() {

        setSize(1280, 720);
        setVisible(true);
        setLayout(null);

        initMenuBar();

        editPanel.setBounds(300, 50, 950, 600);
        add(editPanel);

        objectPickerPanel.setBounds(30, 50, 240, 600);
        add(objectPickerPanel);

    }

    private void initMenuBar() {
        fileNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewProjectWindow newProjectWindow = new NewProjectWindow();
            }
        });
        menuFile.add(fileNew);
        menuFile.add(fileSave);
        menuFile.add(fileLoad);

        objectAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new AddObjectWindow();
            }
        });
        menuObject.add(objectAdd);

        menuBar.add(menuFile);

        menuBar.add(menuObject);

        menuBar.setBounds(0, 0, getWidth(), 30);

        add(menuBar);
    }

}
