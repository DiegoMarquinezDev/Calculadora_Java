package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.border.LineBorder;

public class Calculator {

	private JFrame frame;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMult;
	private JButton btnDiv;
	private JButton btnEquals;
	private JButton btnPoint;
	private JButton btnReset;
	private JButton btnPosNeg;
	private JButton btnDelete;
	private JTextField textField;

	private String operador;
	private double op1;
	private double op2;
	private double numero;
	private double resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(104, 104, 104));
		frame.setBounds(100, 100, 290, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBorder(null);
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 22, 250, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn0.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn0.setBackground(new Color(122, 122, 122));
			}
		});
		btn0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn0.setBorder(null);
		btn0.setBackground(new Color(122, 122, 122));
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setFont(new Font("Arial", Font.BOLD, 15));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setBounds(10, 353, 120, 55);
		frame.getContentPane().add(btn0);

		btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBackground(new Color(122, 122, 122));
			}
		});
		btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn1.setBorder(null);
		btn1.setBackground(new Color(122, 122, 122));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Arial", Font.BOLD, 15));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
					textField.setText(textField.getText() + "1");
				} else {
					textField.setText(textField.getText() + "1");
				}
			}
		});
		btn1.setBounds(10, 287, 55, 55);
		frame.getContentPane().add(btn1);

		btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setBackground(new Color(122, 122, 122));
			}
		});
		btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn2.setBorder(null);
		btn2.setBackground(new Color(122, 122, 122));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Arial", Font.BOLD, 15));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
					textField.setText(textField.getText() + "2");
				} else {
					textField.setText(textField.getText() + "2");
				}
			}
		});
		btn2.setBounds(75, 287, 55, 55);
		frame.getContentPane().add(btn2);

		btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn3.setBackground(new Color(122, 122, 122));
			}
		});
		btn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn3.setBorder(null);
		btn3.setBackground(new Color(122, 122, 122));
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setFont(new Font("Arial", Font.BOLD, 15));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
					textField.setText(textField.getText() + "3");
				} else {
					textField.setText(textField.getText() + "3");
				}
			}
		});
		btn3.setBounds(140, 287, 55, 55);
		frame.getContentPane().add(btn3);

		btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn4.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn4.setBackground(new Color(122, 122, 122));
			}
		});
		btn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn4.setBorder(null);
		btn4.setBackground(new Color(122, 122, 122));
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setFont(new Font("Arial", Font.BOLD, 15));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
					textField.setText(textField.getText() + "4");
				} else {
					textField.setText(textField.getText() + "4");
				}
			}
		});
		btn4.setBounds(10, 221, 55, 55);
		frame.getContentPane().add(btn4);

		btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn5.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn5.setBackground(new Color(122, 122, 122));
			}
		});
		btn5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn5.setBorder(null);
		btn5.setBackground(new Color(122, 122, 122));
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setFont(new Font("Arial", Font.BOLD, 15));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
					textField.setText(textField.getText() + "5");
				} else {
					textField.setText(textField.getText() + "5");
				}
			}
		});
		btn5.setBounds(75, 221, 55, 55);
		frame.getContentPane().add(btn5);

		btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn6.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn6.setBackground(new Color(122, 122, 122));
			}
		});
		btn6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn6.setBorder(null);
		btn6.setBackground(new Color(122, 122, 122));
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setFont(new Font("Arial", Font.BOLD, 15));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
					textField.setText(textField.getText() + "6");
				} else {
					textField.setText(textField.getText() + "6");
				}
			}
		});
		btn6.setBounds(140, 221, 55, 55);
		frame.getContentPane().add(btn6);

		btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn7.setBackground(new Color(122, 122, 122));
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 15));
		btn7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn7.setBorder(null);
		btn7.setBackground(new Color(122, 122, 122));
		btn7.setForeground(new Color(255, 255, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
					textField.setText(textField.getText() + "7");
				} else {
					textField.setText(textField.getText() + "7");
				}
			}
		});
		btn7.setBounds(10, 155, 55, 55);
		frame.getContentPane().add(btn7);

		btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn8.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn8.setBackground(new Color(122, 122, 122));
			}
		});
		btn8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn8.setBorder(null);
		btn8.setBackground(new Color(122, 122, 122));
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setFont(new Font("Arial", Font.BOLD, 15));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
					textField.setText(textField.getText() + "8");
				} else {
					textField.setText(textField.getText() + "8");
				}
			}
		});
		btn8.setBounds(75, 155, 55, 55);
		frame.getContentPane().add(btn8);

		btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn9.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn9.setBackground(new Color(122, 122, 122));
			}
		});
		btn9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn9.setBorder(null);
		btn9.setBackground(new Color(122, 122, 122));
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setFont(new Font("Arial", Font.BOLD, 15));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().equals("0")) {
					textField.setText("");
					textField.setText(textField.getText() + "9");
				} else {
					textField.setText(textField.getText() + "9");
				}
			}
		});
		btn9.setBounds(140, 155, 55, 55);
		frame.getContentPane().add(btn9);

		btnPlus = new JButton("+");
		btnPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPlus.setBackground(new Color(122, 122, 122));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnPlus.setBackground(new Color(81, 81, 81));
			}
		});
		btnPlus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPlus.setBorder(null);
		btnPlus.setBackground(new Color(81, 81, 81));
		btnPlus.setForeground(new Color(255, 255, 255));
		btnPlus.setFont(new Font("Arial", Font.BOLD, 15));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = Integer.parseInt(textField.getText());
				textField.setText("");
				operador = "suma";
			}
		});
		btnPlus.setBounds(205, 287, 55, 55);
		frame.getContentPane().add(btnPlus);

		btnMinus = new JButton("-");
		btnMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMinus.setBackground(new Color(122, 122, 122));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMinus.setBackground(new Color(81, 81, 81));
			}
		});
		btnMinus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMinus.setBorder(null);
		btnMinus.setBackground(new Color(81, 81, 81));
		btnMinus.setForeground(new Color(255, 255, 255));
		btnMinus.setFont(new Font("Arial", Font.BOLD, 15));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = Integer.parseInt(textField.getText());
				textField.setText("");
				operador = "resta";
			}
		});
		btnMinus.setBounds(205, 221, 55, 55);
		frame.getContentPane().add(btnMinus);

		btnMult = new JButton("x");
		btnMult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMult.setBackground(new Color(122, 122, 122));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnMult.setBackground(new Color(81, 81, 81));
			}
		});
		btnMult.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMult.setBorder(null);
		btnMult.setBackground(new Color(81, 81, 81));
		btnMult.setForeground(new Color(255, 255, 255));
		btnMult.setFont(new Font("Arial", Font.BOLD, 15));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = Integer.parseInt(textField.getText());
				textField.setText("");
				operador = "mult";
			}
		});
		btnMult.setBounds(205, 155, 55, 55);
		frame.getContentPane().add(btnMult);

		btnDiv = new JButton("/");
		btnDiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDiv.setBackground(new Color(122, 122, 122));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDiv.setBackground(new Color(81, 81, 81));
			}
		});
		btnDiv.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDiv.setBorder(null);
		btnDiv.setBackground(new Color(81, 81, 81));
		btnDiv.setForeground(new Color(255, 255, 255));
		btnDiv.setFont(new Font("Arial", Font.BOLD, 15));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = Integer.parseInt(textField.getText());
				textField.setText("");
				operador = "div";
			}
		});
		btnDiv.setBounds(205, 88, 55, 55);
		frame.getContentPane().add(btnDiv);

		btnEquals = new JButton("=");
		btnEquals.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEquals.setBackground(new Color(75, 130, 229));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnEquals.setBackground(new Color(63, 150, 221));
			}
		});
		btnEquals.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEquals.setBorder(null);
		btnEquals.setBackground(new Color(63, 150, 221));
		btnEquals.setForeground(new Color(255, 255, 255));
		btnEquals.setFont(new Font("Arial", Font.BOLD, 15));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat decimalFormat = new DecimalFormat("#.##");
				decimalFormat.setDecimalSeparatorAlwaysShown(false);

				op2 = Integer.parseInt(textField.getText());
				switch (operador) {
				case "suma":
					resultado = op1 + op2;
					String resultadoFormateadoSuma = decimalFormat.format(resultado);
					textField.setText(resultadoFormateadoSuma);
					break;
				case "resta":
					resultado = op1 - op2;
					String resultadoFormateadoResta = decimalFormat.format(resultado);
					textField.setText(resultadoFormateadoResta);
					break;
				case "mult":
					resultado = op1 * op2;
					String resultadoFormateadoMult = decimalFormat.format(resultado);
					textField.setText(resultadoFormateadoMult);
					break;
				case "div":
					try {
						if (op2 == 0) {
							throw new ArithmeticException("No se puede dividir entre cero");
						}
						resultado = op1 / op2;
						String resultadoFormateadoDiv = decimalFormat.format(resultado);
						textField.setText(resultadoFormateadoDiv);
					} catch (ArithmeticException ex) {
						textField.setFont(new Font("Arial", Font.BOLD, 15));
						textField.setHorizontalAlignment(SwingConstants.CENTER);
						textField.setText(ex.getMessage());
						btn0.setEnabled(false);
						btn1.setEnabled(false);
						btn2.setEnabled(false);
						btn3.setEnabled(false);
						btn4.setEnabled(false);
						btn5.setEnabled(false);
						btn6.setEnabled(false);
						btn7.setEnabled(false);
						btn8.setEnabled(false);
						btn9.setEnabled(false);
						btnPlus.setEnabled(false);
						btnMinus.setEnabled(false);
						btnMult.setEnabled(false);
						btnDiv.setEnabled(false);
						btnEquals.setEnabled(false);
						btnPoint.setEnabled(false);
						btnPosNeg.setEnabled(false);
						btnDelete.setEnabled(false);
					}
					break;

				}
			}
		});
		btnEquals.setBounds(205, 353, 55, 55);
		frame.getContentPane().add(btnEquals);

		btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ",");
			}
		});
		btnPoint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPoint.setBackground(new Color(81, 81, 81));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnPoint.setBackground(new Color(122, 122, 122));
			}
		});
		btnPoint.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPoint.setBorder(null);
		btnPoint.setBackground(new Color(122, 122, 122));
		btnPoint.setForeground(new Color(255, 255, 255));
		btnPoint.setFont(new Font("Arial", Font.BOLD, 15));
		btnPoint.setBounds(140, 354, 55, 55);
		frame.getContentPane().add(btnPoint);

		btnReset = new JButton("C");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReset.setBackground(new Color(122, 122, 122));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnReset.setBackground(new Color(81, 81, 81));
			}
		});
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.setBorder(null);
		btnReset.setBackground(new Color(81, 81, 81));
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setFont(new Font("Arial", Font.BOLD, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setFont(new Font("Arial", Font.PLAIN, 20));
				textField.setHorizontalAlignment(SwingConstants.RIGHT);
				textField.setText("0");
				op1 = 0;
				op2 = 0;
				operador = "";
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnPlus.setEnabled(true);
				btnMinus.setEnabled(true);
				btnMult.setEnabled(true);
				btnDiv.setEnabled(true);
				btnEquals.setEnabled(true);
				btnPoint.setEnabled(true);
				btnPosNeg.setEnabled(true);
				btnDelete.setEnabled(true);
			}
		});
		btnReset.setBounds(10, 89, 55, 55);
		frame.getContentPane().add(btnReset);

		btnPosNeg = new JButton("+/-");
		btnPosNeg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPosNeg.setBackground(new Color(122, 122, 122));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnPosNeg.setBackground(new Color(81, 81, 81));
			}
		});
		btnPosNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = Integer.parseInt(textField.getText());
				if (numero >= 0) {
					textField.setText("-" + textField.getText());
				} else {
					operador = textField.getText();
					String operadorPositivo = operador.substring(1);
					textField.setText(operadorPositivo);

				}

			}
		});
		btnPosNeg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPosNeg.setBorder(null);
		btnPosNeg.setBackground(new Color(81, 81, 81));
		btnPosNeg.setForeground(new Color(255, 255, 255));
		btnPosNeg.setFont(new Font("Arial", Font.BOLD, 15));
		btnPosNeg.setBounds(75, 89, 55, 55);
		frame.getContentPane().add(btnPosNeg);

		btnDelete = new JButton("DEL");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = textField.getText();
				String operadorDelete = operador.substring(0, operador.length() - 1);
				textField.setText(operadorDelete);
			}
		});
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDelete.setBackground(new Color(122, 122, 122));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDelete.setBackground(new Color(81, 81, 81));
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Arial", Font.BOLD, 15));
		btnDelete.setBorder(null);
		btnDelete.setBackground(new Color(81, 81, 81));
		btnDelete.setBounds(140, 88, 55, 55);
		frame.getContentPane().add(btnDelete);

	}
}
