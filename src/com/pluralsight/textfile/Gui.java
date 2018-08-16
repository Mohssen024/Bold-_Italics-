package com.pluralsight.textfile;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui extends JFrame {

    private JComboBox box;
    private JLabel pic;
    private static String [] fileName = {"b.jpg", "a.jpg"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(fileName[0])), new ImageIcon(getClass().getResource(fileName[1]))};

    public Gui(){
        super("THE TITLE ");
        setLayout(new FlowLayout());

        box = new JComboBox(fileName);

        box.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent event) {
                        if(event.getStateChange() == ItemEvent.SELECTED)
                            pic.setIcon(pics[box.getSelectedIndex()]);


                    }
                }
        );
        add(box);
        pic = new JLabel(pics[0]);
        add(pic);
    }




    }


