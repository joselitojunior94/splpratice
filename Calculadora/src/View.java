/**
 * TODO description
 */

import java.awt.GridLayout; 

import javax.swing.*; 

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JTextField; import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JPanel; 

/**
 * TODO description
 */
public   class  View {
	
	JFrame janela  ;

	
	JPanel panel  ;

	
	JTextField input01  ;

	
	JTextField input02  ;

	
	JTextField output  ;

	
	JLabel resultado;

	
	
	public View  (){
		janela = new JFrame("Calculadora");
		janela.setSize(400,420);
		janela.setVisible(true);
		panel = new JPanel(new GridLayout(4,4,4,4));
		
		setFieldInputs();
		
		setFieldOutput();
	
		botaoSomar = new JButton("+");
		botaoSomar.setSize(5, 5);
		
		
		botaoSomar.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  try{
		    		  Calcular c = new Calcular();	  
		    		  output.setText(Integer.toString(
		    			  c.somar(Integer.parseInt(input01.getText()), 
		    					  Integer.parseInt(input02.getText()))));
		    		  janela.revalidate();
		    	  }catch(Exception f){
		    		  JOptionPane.showMessageDialog(null,"Operações somente com inteiros!");
		    	  }
		      }
		});
		
		panel.add(botaoSomar);
		janela.add(panel);
		janela.revalidate();
	
		botaoSubtrair = new JButton("-");
		botaoSubtrair.setSize(5,5);
		
		botaoSubtrair.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  try{
		    		  Calcular c = new Calcular();	  
		    		  output.setText(Integer.toString(
		    			  c.subtrair(Integer.parseInt(input01.getText()), 
		    					  Integer.parseInt(input02.getText()))));
		    		  janela.revalidate();
		    	  }catch(Exception f){
		    		  JOptionPane.showMessageDialog(null,"Operações somente com inteiros!");
		    	  }
		      }
		});
		
		panel.add(botaoSubtrair);	
		janela.add(panel);
		janela.revalidate();
	
		botaoMult = new JButton("*");
		botaoMult .setSize(5,5);
		
		botaoMult.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  try{
		    		  Calcular c = new Calcular();	  
		    		  output.setText(Integer.toString(
		    			  c.multiplicar(Integer.parseInt(input01.getText()), 
		    					  Integer.parseInt(input02.getText()))));
		    		  janela.revalidate();
		    	  }catch(Exception f){
			    		  JOptionPane.showMessageDialog(null,"Operações somente com inteiros!");
		    	  }
		      }
		});
		
		panel.add(botaoMult);	
		janela.add(panel);
		janela.revalidate();
	
		botaoDiv = new JButton("/");
		botaoDiv .setSize(5,5);
		
		botaoDiv.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  try{
		    		  Calcular c = new Calcular();	  
		    		  output.setText(Integer.toString(
		    			  c.dividir(Integer.parseInt(input01.getText()), 
		    					  Integer.parseInt(input02.getText()))));
		    		  janela.revalidate();
		    	  }catch(Exception f){
		    		  JOptionPane.showMessageDialog(null,"Operações somente com inteiros!");
		    	  }
		      }
		});
		
		panel.add(botaoDiv);	
		janela.add(panel);
		janela.revalidate();
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

	
	JButton botaoSomar;

	
	
	public void listenButton(){
		
	}

	
	JButton botaoSubtrair;

	
	JButton botaoMult;

	
	JButton botaoDiv;


}
