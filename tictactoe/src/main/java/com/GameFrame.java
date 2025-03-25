package com;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameFrame extends JFrame{
    
    private JButton[] btn = new JButton[9];
    private JPanel GamePanel = new JPanel();
    private JPanel Player1_ScoreBoard = new JPanel();
    private JPanel Player2_ScoreBoard = new JPanel();
    private JPanel LeftWrap = new JPanel();
    private JPanel RightWrap = new JPanel();
    private JLabel Player1_Label = new JLabel();
    private JLabel Player2_Label = new JLabel();
    private JLabel Player1_Score = new JLabel();
    private JLabel Player2_Score = new JLabel();

        GameFrame(){
        
        this.setSize(1000,800);
        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        
        this.add(LeftWrap,BorderLayout.WEST);
        LeftWrap.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 300));
        LeftWrap.add(Player1_ScoreBoard);
        Player1_ScoreBoard.setLayout(new BorderLayout());
        Player1_ScoreBoard.setPreferredSize(new Dimension(150, 200));
        Player1_ScoreBoard.add(Player1_Score,BorderLayout.CENTER);
        
        Player1_Score.setText("0");
        Player1_Score.setFont(new Font("Arial", Font.BOLD, 70));
        Player1_Score.setVerticalAlignment(SwingConstants.BOTTOM);
        Player1_ScoreBoard.add(Player1_Label, BorderLayout.NORTH);
        Player1_Label.setText("Player 1");
        Player1_Label.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.add(RightWrap,BorderLayout.EAST);
        RightWrap.setLayout(new FlowLayout(FlowLayout.CENTER, 20 , 300));
        RightWrap.add(Player2_ScoreBoard);
        
        
        Player2_ScoreBoard.setPreferredSize(new Dimension(150, 200));
        
        
        GamePanel.setLayout(new GridLayout(3,3, 10, 10));
        GamePanel.setPreferredSize(new Dimension(500,500));
        this.add(GamePanel,BorderLayout.CENTER);
        for (int i = 0; i < 9; i++) {
            btn[i] = new JButton();
            btn[i].addActionListener(e -> System.out.println("button works"));
            btn[i].setFocusable(false);
            GamePanel.add(btn[i]);
        }

        this.setVisible(true);

    }

}
