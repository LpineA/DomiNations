package com.sdz.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;

public class Window {

	private final JPanel board = new JPanel(new BorderLayout(3, 3));
	private JButton[][] c1squares = new JButton[10][10];
	private JPanel Board;
	// private final JLabel messagec1 = new JLabel("Player 1 Board");
	JToolBar tool = new JToolBar();
	Insets Margin = new Insets(0, 0, 0, 0);
	int squares = 10;
	int space = 100;
	ImageIcon icon = new ImageIcon(new BufferedImage(space, space, BufferedImage.TYPE_INT_ARGB));

	Window() {
		initialize();
	}

	public final void initialize() {

		board.setBorder(new EmptyBorder(5, 5, 5, 5));
		tool.setFloatable(false);
		board.add(tool, BorderLayout.PAGE_START);
		// tool.add(messagec1);
		Board = new JPanel(new GridLayout(0, 10));
		board.add(Board);

		for (int i = 1; i < c1squares.length; i++) {
			for (int j = 0; j < c1squares[i].length; j++) {
				JButton b = new JButton();
				b.setMargin(Margin);
				b.setIcon(icon);

				c1squares[j][i] = b;
			}
		}
		for (int i = 1; i < squares; i++) {
			for (int j = 0; j < squares; j++) {
				Board.add(c1squares[j][i]);
			}
		}
	}

	public final JComponent draw() {
		return board;
	}
	
	public static void main(String[] args) {
		Window fen = new Window();
		fen.initialize();
	}
}




