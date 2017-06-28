import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * TODO description
 */
public class View {
	JFrame janela;
	JButton botaoSubtrair;
	JPanel 	panel;
	
	public View(){
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
		    		  System.out.println("Existe um erro ao calcular subtracao");
		    	  }
		      }
		});
		
		panel.add(botaoSubtrair);	
		janela.add(panel);
		janela.revalidate();
	}
}