package com.guiapp;

import javax.swing.*;

public class Calculator {
    private JPanel panel1;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Claculator");
        frame.setContentPane(new Calculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
