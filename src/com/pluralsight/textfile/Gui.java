package com.pluralsight.textfile;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui extends JFrame {

    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;

    public Gui(){
        super("THE TITLE");
        setLayout(new FlowLayout());


        tf = new JTextField("MOHSEN IS A GREAT GUY!", 26 );
        add(tf);

        pf = new Font("serif", Font.PLAIN, 14);
        bf = new Font("serif", Font.BOLD, 14);
        itf = new Font("serif", Font.ITALIC , 14);
        bif = new Font("serif", Font.BOLD + Font.ITALIC, 14);

        pb = new JRadioButton("plain", true);
        bb = new JRadioButton("bold", false);
        ib = new JRadioButton("italic", false);
        bib = new JRadioButton("bold and italic", false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        // wait for event to happen, pass in font object to instructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));

    }
    private class HandlerClass implements ItemListener{
        private Font font;


        // the Font object gets variable font
        public HandlerClass(Font f){
            font = f;
        }
        public void itemStateChanged(ItemEvent event){
            tf.setFont(font);
        }




    }




    }


