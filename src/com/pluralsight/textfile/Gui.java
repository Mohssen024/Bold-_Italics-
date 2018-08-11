package com.pluralsight.textfile;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui extends JFrame {

    private JTextField tf;
    private JCheckBox boldBox;
    private JCheckBox italicBox;

    public Gui(){
        super("the title");
        setLayout(new FlowLayout());

        tf = new JTextField("this is a sentence", 20);
        tf.setFont(new Font("serif", Font.PLAIN, 14 ));
        add(tf);
        boldBox = new JCheckBox("BOLD");
        italicBox = new JCheckBox("ITALIC");
        add(boldBox);
        add(italicBox);


        HandlerClass handler = new HandlerClass();
        boldBox.addItemListener(handler);
        italicBox.addItemListener(handler);


    }

    private class HandlerClass implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            Font font = null;
            if(boldBox.isSelected()&& italicBox.isSelected()) {
                font = new Font("serif", Font.BOLD + Font.ITALIC, 14);
            }
                else if(boldBox.isSelected()){
                    font = new Font("serif", Font.BOLD,14);

                }
                else if (italicBox.isSelected()){
                font = new Font("serif", Font.ITALIC,14);
            }
            else
                font = new Font("serif", Font.PLAIN, 14);
            tf.setFont(font);

        }
    }





        }