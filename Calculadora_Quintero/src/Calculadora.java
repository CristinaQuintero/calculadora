import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.Point;
import javax.swing.JEditorPane;

public class Calculadora extends JFrame {

	// variables
	String operacion;

	private JPanel contentPane;
	private static JTextField textField;
	// variables

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}// fin del main

	/**
	 * Create the frame.
	 */
	public Calculadora() {

		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Calculadora.class.getResource("/Imagen/calculadora-pixel_318-84809.jpg")));
		setFont(new Font("Arial", Font.PLAIN, 12));
		setBackground(new Color(255, 192, 203));
		setForeground(new Color(255, 255, 255));
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// mostrar en pantalla el resultado.
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);

		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		textField.setToolTipText("");
		textField.setEditable(false);
		textField.setBackground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setForeground(new Color(204, 0, 102));
		textField.setFont(new Font("Stencil", Font.PLAIN, 20));

		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");

			}
		});
		boton1.setBounds(10, 164, 55, 31);
		boton1.setForeground(new Color(255, 105, 180));
		boton1.setFont(new Font("Stencil", Font.BOLD, 18));
		panel.add(boton1);

		JButton boton2 = new JButton("2");
		boton2.setForeground(new Color(255, 105, 180));
		boton2.setBounds(81, 164, 55, 31);
		boton2.setFont(new Font("Stencil", Font.BOLD, 18));
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "2");
			}
		});
		panel.add(boton2);

		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		boton3.setForeground(new Color(255, 105, 180));
		boton3.setBounds(146, 164, 55, 31);
		boton3.setFont(new Font("Stencil", Font.BOLD, 18));
		panel.add(boton3);

		JButton boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		boton0.setForeground(new Color(255, 105, 180));
		boton0.setFont(new Font("Stencil", Font.BOLD, 18));
		boton0.setBounds(81, 206, 55, 31);
		panel.add(boton0);

		JButton botonpunto = new JButton(".");
		botonpunto.setBackground(new Color(255, 102, 153));
		botonpunto.setForeground(new Color(102, 0, 51));
		botonpunto.setFont(new Font("Stencil", Font.BOLD, 20));
		botonpunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}

		});
		botonpunto.setBounds(10, 206, 55, 31);
		panel.add(botonpunto);

		JButton botonigual = new JButton("=");
		botonigual.setBackground(new Color(255, 102, 153));
		botonigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				String operacion = textField.getText();
				String res = operacionLibre(operacion);

			}

		});

		botonigual.setForeground(new Color(102, 0, 51));
		botonigual.setFont(new Font("Stencil", Font.BOLD, 20));
		botonigual.setBounds(146, 206, 55, 31);
		panel.add(botonigual);

		JButton boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		boton4.setForeground(new Color(255, 105, 180));
		boton4.setFont(new Font("Stencil", Font.BOLD, 18));
		boton4.setBounds(10, 122, 55, 31);
		panel.add(boton4);

		JButton boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText() + "5");
			}
		});
		boton5.setForeground(new Color(255, 105, 180));
		boton5.setFont(new Font("Stencil", Font.BOLD, 18));
		boton5.setBounds(81, 122, 55, 31);
		panel.add(boton5);

		JButton boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		boton6.setForeground(new Color(255, 105, 180));
		boton6.setFont(new Font("Stencil", Font.BOLD, 18));
		boton6.setBounds(146, 122, 55, 31);
		panel.add(boton6);

		JButton boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}

		});
		boton7.setForeground(new Color(255, 105, 180));
		boton7.setFont(new Font("Stencil", Font.BOLD, 18));
		boton7.setBounds(10, 80, 55, 31);
		panel.add(boton7);

		JButton boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		boton8.setForeground(new Color(255, 105, 180));
		boton8.setFont(new Font("Stencil", Font.BOLD, 18));
		boton8.setBounds(81, 80, 55, 31);
		panel.add(boton8);

		JButton boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		boton9.setForeground(new Color(255, 105, 180));
		boton9.setFont(new Font("Stencil", Font.BOLD, 18));
		boton9.setBounds(146, 80, 55, 31);
		panel.add(boton9);

		JButton botonSuma = new JButton("+");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");

			}
		});
		botonSuma.setForeground(new Color(102, 0, 51));
		botonSuma.setFont(new Font("Stencil", Font.BOLD, 18));
		botonSuma.setBackground(new Color(255, 102, 153));
		botonSuma.setBounds(211, 167, 55, 74);
		panel.add(botonSuma);

		JButton botonResta = new JButton("-");
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");

			}
		});
		botonResta.setForeground(new Color(102, 0, 51));
		botonResta.setFont(new Font("Stencil", Font.BOLD, 18));
		botonResta.setBackground(new Color(255, 102, 153));
		botonResta.setBounds(211, 123, 55, 31);
		panel.add(botonResta);

		JButton botonDivision = new JButton("\u00F7");
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});
		botonDivision.setForeground(new Color(102, 0, 51));
		botonDivision.setFont(new Font("Stencil", Font.PLAIN, 20));
		botonDivision.setBackground(new Color(255, 102, 153));
		botonDivision.setBounds(211, 44, 55, 31);
		panel.add(botonDivision);

		JButton botonMultiplicion = new JButton("*");
		botonMultiplicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");

			}
		});
		botonMultiplicion.setBackground(new Color(255, 102, 153));
		botonMultiplicion.setForeground(new Color(102, 0, 51));
		botonMultiplicion.setFont(new Font("Stencil", Font.PLAIN, 14));
		botonMultiplicion.setBounds(211, 80, 55, 31);
		panel.add(botonMultiplicion);

		JButton botonInicio = new JButton("Ce");
		botonInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Se elimina el numero de la pantalla para iniciar nueva
				 * operacion
				 */

				textField.setText("");

			}
		});
		botonInicio.setBackground(new Color(255, 102, 153));
		botonInicio.setForeground(new Color(102, 0, 51));
		botonInicio.setFont(new Font("Stencil", Font.PLAIN, 16));
		botonInicio.setBounds(10, 46, 55, 31);
		panel.add(botonInicio);

		JButton botonRaiz = new JButton("\u221A");
		botonRaiz.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// operacion para sacar raices cuadradas
				textField.setText(textField.getText() + "\u221A");

			}
		});
		botonRaiz.setBackground(new Color(255, 102, 153));
		botonRaiz.setForeground(new Color(102, 0, 51));
		botonRaiz.setFont(new Font("Stencil", Font.PLAIN, 20));
		botonRaiz.setBounds(81, 45, 55, 31);
		panel.add(botonRaiz);

		JButton botonCuadrado = new JButton("x²");
		botonCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// operacion para sacar el cuadrado de un numero.
				textField.setText(textField.getText() + "²");

			}
		});
		botonCuadrado.setBackground(new Color(255, 102, 153));
		botonCuadrado.setForeground(new Color(102, 0, 51));
		botonCuadrado.setFont(new Font("Stencil", Font.PLAIN, 12));
		botonCuadrado.setBounds(146, 46, 55, 31);
		panel.add(botonCuadrado);
		panel_1.add(textField);
		textField.setColumns(16);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { contentPane, panel, boton1, boton2, boton3,
				boton0, botonpunto, botonigual, boton4, boton5, boton6, boton7, boton8, boton9, botonSuma, botonResta,
				botonDivision, botonMultiplicion }));

	}

	public static String operacionLibre(String operacion) {

		if (operacion.indexOf("+") != -1) {

			int index = operacion.indexOf("+");
			String primera = operacion.substring(0, index);
			String segunda = operacion.substring(index + 1);

			double operador = Double.parseDouble(primera);
			double operando = Double.parseDouble(segunda);
			double res = Operacion.suma(operador, operando);
			textField.setText(textField.getText() + " = " + res);

		} else if (operacion.indexOf("-") != -1) {

			int index = operacion.indexOf("-");
			String primera = operacion.substring(0, index);
			String segunda = operacion.substring(index + 1);

			double operador = Double.parseDouble(primera);
			double operando = Double.parseDouble(segunda);
			double res = Operacion.restar(operador, operando);
			textField.setText(textField.getText() + " = " + res);

		} else if (operacion.indexOf("/") != -1) {

			int index = operacion.indexOf("/");
			String primera = operacion.substring(0, index);
			String segunda = operacion.substring(index + 1);

			double operador = Double.parseDouble(primera);
			double operando = Double.parseDouble(segunda);
			double res = Operacion.dividir(operador, operando);
			textField.setText(textField.getText() + " = " + res);

		} else if (operacion.indexOf("*") != -1) {

			int index = operacion.indexOf("*");
			String primera = operacion.substring(0, index);
			String segunda = operacion.substring(index + 1);

			double operador = Double.parseDouble(primera);
			double operando = Double.parseDouble(segunda);
			double res = Operacion.multiplicar(operador, operando);
			textField.setText(textField.getText() + " = " + res);

		} else if (operacion.indexOf("\u221A") != -1) {

			int index = operacion.indexOf("\u221A");
			String primera = operacion.substring(0, index);

			double operador = Double.parseDouble(primera);
			double res = Operacion.raiz(operador);
			textField.setText(textField.getText() + " = " + res);

		} else if (operacion.indexOf("²") != -1) {

			int index = operacion.indexOf("²");
			String primera = operacion.substring(0, index);

			double operador = Double.parseDouble(primera);
			double res = Operacion.alcuadrado(operador);
			textField.setText(textField.getText() + " = " + res);

		}
		return operacion;

	}

}
