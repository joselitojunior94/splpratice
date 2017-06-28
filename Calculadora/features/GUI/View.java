/**
 * TODO description
 */

import java.awt.GridLayout;

import javax.swing.*;

public class View {
	JFrame janela;
	JPanel panel;
	JTextField input01;
	JTextField input02;
	JTextField output;
	JLabel resultado;
	
	public View(){
		janela = new JFrame("Calculadora");
		janela.setSize(400,420);
		janela.setVisible(true);
		panel = new JPanel(new GridLayout(4,4,4,4));
		
		setFieldInputs();
		
		setFieldOutput();
	}
	
	public void setFieldInputs(){
		input01 = new JTextField(20);
		input02 = new JTextField(20);
		input01.setSize(5,5);
		input02.setSize(5,5);
		panel.add(input01);
		panel.add(input02);
		janela.add(panel);
		janela.revalidate();
	}
	
	public void setFieldOutput(){
		resultado = new JLabel();
		resultado.setText(" Resultado: ");
		panel.add(resultado);
		output = new JTextField(20);
		output.setSize(10,10);
		
		panel.add(output);
		janela.add(panel);
		janela.revalidate();
	}
	
}