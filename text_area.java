package baseis;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * this class create a scrollable text area
 * @author andreas
 *
 */
public class text_area {
	private JTextArea stoixeia ; 
	private JScrollPane a ;
	
	/**
	 * this constructs the size , the location in the frame and the background of the text area
	 */
	public text_area(String ee){
		 stoixeia = new JTextArea(
					
					"                       \n\n    Head  Hunters    4U ");
		 stoixeia.setEditable(false);
		 stoixeia.setVisible(true);
			stoixeia.setBackground(Color.gray);
		 a = new JScrollPane(stoixeia);
		a.setLocation(0 ,200);
	a.setVisible(true);
		a.setSize(890,300);
		
	}
	public void refreshTextArea(String aa){
		
		stoixeia.setText(				"\nMETHODOS LEITOURGIAS THS PLATFORMAS HeadHunters4U"+
				"\n"+
				"\n			Request"+

	"\n		1.Sign up: Eggrafh ws melos ths etairias"+
	"\n					Ta melh sumplhrwnoun ta stoixeia tous ( onoma, diefthinsh, thlefwno,"+
	"\n				email,arithmo logariasmou kai stoixeia pistwtikhs) ki epeita epilegoun th ka"+
	"\n				thgoria sthn opoia anhkoun (company, individuals or new store). Bash ths epi"+
	"\n				loghstou o xrhsths sumplhrwnei ta eidika gnwrismata ths kathe kathgorias (polh"+
	"\n                             polh gia to company, to id, polh kai loipes leptomeries gia to neo katasthma kai"+
	"\n				epaggelma gia tous individuals. Kata to telos ths eggrafhs parexetai to anagnwri"+
	"\n				stiko gia to neo melos.								 ");
		
	}
	/**
	 * this function return the text area witch the constructor create
	 * @return the text area
	 */
	public JScrollPane GetJEditorPane(){return a;}
	public JTextArea GetJTextArea(){return stoixeia;}

}