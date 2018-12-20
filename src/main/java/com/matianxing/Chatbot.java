package com.matianxing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chatbot extends JFrame {

    private JTextArea Chararea = new JTextArea();
    private JTextField chatbox = new JTextField();



    public Chatbot() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600,600);
        frame.setTitle("ChatBot");
        frame.add(Chararea);
        frame.add(chatbox);
        //FOR TTEXTAREA
        Chararea.setSize(500, 400);
        Chararea.setLocation(2, 2);

        //FOR TEXTFIELD
        chatbox.setSize(540, 30);
        chatbox.setLocation(2, 550);

        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gtext = chatbox.getText();
                Chararea.append("YOU ->"+ gtext + "\n");
                chatbox.setText("");

                if(gtext.contains("Hi")){
                    Chatbot("How are you?");
                }
                if (gtext.contains("Fine")){
                    Chatbot("Thank you.");
                }
                if (gtext.contains("weather")){
                    Chatbot("76F");
                }
            }
        });
     }
    private  void Chatbot(String string) {
        Chararea.append("BOT ->" +string+ "\n");


    }




    public static void main(String args[] ){
        new Chatbot();

    }
}
