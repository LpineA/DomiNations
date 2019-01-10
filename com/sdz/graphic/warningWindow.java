package com.sdz.graphic;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class warningWindow extends JFrame implements ActionListener {
	
	JLabel messageLabel = new JLabel();
    JButton validation = new JButton("Fermer");
    JPanel conteneur = new JPanel();
	
    public warningWindow(String message){
    	this.setTitle(" Warning ");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(messageLabel);
        this.getContentPane().add(conteneur);
        messageLabel.setText(message);
        messageLabel.setVisible(true);
        conteneur.setPreferredSize(new Dimension(30, 30));
        conteneur.add(messageLabel);
        conteneur.add(validation);
        validation.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == validation) {
    		this.setVisible(false);
    	}
    }
    
	public static void main(String[] args) {
		warningWindow warning = new warningWindow("Ceci est un test");
		warning.setVisible(true);
	}
}

