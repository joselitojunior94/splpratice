import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * TODO description
 */
public class View {
	JFrame janela;
	JButton botaoMult;
	JPanel 	panel;
	
	public View(){
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
	}
}