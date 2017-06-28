import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * TODO description
 */
public class View {
	JFrame janela;
	JButton botaoExp;
	JPanel 	panel;
	
	public View(){
		botaoExp = new JButton("^");
		botaoExp .setSize(5,5);
		
		botaoExp.addActionListener(new ActionListener()
	    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  try{
		    		  Calcular c = new Calcular();	  
		    		  output.setText(Integer.toString(
		    			  c.exponencial(Integer.parseInt(input01.getText()), 
		    					  Integer.parseInt(input02.getText()))));
		    		  janela.revalidate();
		    	  }catch(Exception f){
			    		  JOptionPane.showMessageDialog(null,"Operações somente com inteiros!");
		    	  }
		      }
		});
		
		panel.add(botaoExp);	
		janela.add(panel);
		janela.revalidate();
	}
}