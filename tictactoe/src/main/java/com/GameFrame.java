package com;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
    
    JButton[] btn = new JButton[9];
    GameFrame(){

        
        

        
        this.setSize(800,800);
        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3,3, 20, 20));
        for (int i = 0; i < 9; i++) {
            btn[i] = new JButton();
            btn[i].addActionListener(e -> System.out.println("This button works"));
            this.add(btn[i]);
        }
    }

}
