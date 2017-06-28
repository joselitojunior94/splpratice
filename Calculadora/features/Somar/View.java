import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TODO description
 */

public class View {
	JFrame janela;
	JButton botaoSomar;
	JPanel 	panel;
	JTextField input01;
	JTextField input02;
	JTextField output;
	
	public View(){
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
	}
	
	public void listenButton(){
		
	}
}