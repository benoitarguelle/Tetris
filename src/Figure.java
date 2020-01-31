import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Figure extends Frame implements ActionListener, ItemListener{
	
	// DECLARATION DES ATTRIBUTS
	private Color couleurForme ;
	private Forme f ;
	private Joueur J0 ;
	private Joueur J1 ;
	private int numFig ;
	private Choice sens ;
	private Choice position ;
	private Button validation ;
	
	public Figure(int numFig, int numJoeur) {
		
		setLayout(new FlowLayout());   
	
		sens = new Choice() ;
		sens.add("à l'endroit");
		sens.add("à l'envers");
		sens.add("rotation à gauche");
		sens.add("rotation à droite");
		sens.addItemListener(this);
		
		position = new Choice() ;
		position.add("0");
		position.add("1");
		position.add("2");
		position.add("3");
		position.add("4");
		position.add("5");
		position.add("6");
		position.add("7");
		position.addItemListener(this);
		
		validation = new Button("Validation");
	}
	

	 public void paint(Graphics g)  {
		// récupération des dimensions de l'application :
		int w = getSize().width; 
		int h = getSize().height;
		
		g.setColor(couleurForme);
		
		switch (f.type) {
		case "O" :
			g.setColor(f.fcouleur[0]);
			g.fillRect(w, h, -100, 100);
			g.setColor(fcouleur[1]);
			g.fillRect(w, h, 100, 100);
			g.setColor(fcouleur[2]);
			g.fillRect(w, h, -100, -100);
			g.setColor(fcouleur[3]);
			g.fillRect(w, h, 100, -100);
			break;
		case "I" :
			g.setColor(f.fcouleur[0]);
			g.fillRect(w-50, h+100, 100, 100);
			g.setColor(fcouleur[1]);
			g.fillRect(w-50, h, 100, 100);
			g.setColor(fcouleur[2]);
			g.fillRect(w-50, h, 100, -100);
			g.setColor(fcouleur[3]);
			g.fillRect(w-5O, h-100, 100, -100);
			break;
		case "T" :
			g.setColor(f.fcouleur[0]);
			g.fillRect(w-150, h+50, 100, 100);
			g.setColor(fcouleur[1]);
			g.fillRect(w-50, h+50, 100, 100);
			g.setColor(fcouleur[2]);
			g.fillRect(w+150, h+50, 100, 100);
			g.setColor(fcouleur[3]);
			g.fillRect(w-50, h-50, 100, 100);
			break ;
		case "L" :
			g.setColor(f.fcouleur[0]);
			g.fillRect(w-50, h+100, 100, 100);
			g.setColor(fcouleur[1]);
			g.fillRect(w-50, h, 100, 100);
			g.setColor(fcouleur[2]);
			g.fillRect(w-50, h-100, 100, 100);
			g.setColor(fcouleur[3]);
			g.fillRect(w+50, h-100, 100, 100);
			break;
		case "J" :
			g.setColor(f.fcouleur[0]);
			g.fillRect(w-50, h+100, 100, 100);
			g.setColor(fcouleur[1]);
			g.fillRect(w+50, h+100, 100, 100);
			g.setColor(fcouleur[2]);
			g.fillRect(w-50, h, 100, 100);
			g.setColor(fcouleur[3]);
			g.fillRect(w-50, h-100, 100, 100);
			break;
		case "Z" :
			g.setColor(f.fcouleur[0]);
			g.fillRect(w-200, h, 100, 100);
			g.setColor(fcouleur[1]);
			g.fillRect(w-100, h, 100, 100);
			g.setColor(fcouleur[2]);
			g.fillRect(w, h-100, 100, 100);
			g.setColor(fcouleur[3]);
			g.fillRect(w+100, h-100, 100, 100);
			break;
		case "S" :
			g.setColor(f.fcouleur[0]);
			g.fillRect(w, h, 100, 100);
			g.setColor(fcouleur[1]);
			g.fillRect(w+100, h, 100, 100);
			g.setColor(fcouleur[2]);
			g.fillRect(w-200, h-100, 100, 100);
			g.setColor(fcouleur[3]);
			g.fillRect(w-100, h-100, 100, 100);
			break;
		}
		

		}	
	
	
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == validation) {
			//// APPPEL AU PROGRAMME POUR METTRE A JOUR LA GRILLE
			f = new Forme() ;
		}
	}	
	
	public void itemStateChanged(ItemEvent evt) {
		switch (sens.getSelectedItem()) {
		case "à l'endroit" :
			f.fsens = 0 ;
			break;
		case "rotation à gauche" :
			f.fsens = 1 ;
			break;
		case "à l'envers" :
			f.fsens = 2 ;
			break;
		case "rotation à droite" :
			f.fsens = 3 ;
			break;
		}
		
		switch (position.getSelectedItem()) {
		case "0" :
			f.fposition = 0 ;
			break;
		case "1" :
			f.fposition = 1 ;
			break;
		case "2" :
			f.fposition = 2 ;
			break;
		case "3" :
			f.fposition = 3 ;
			break;
		case "4" :
			f.fposition = 4 ;
			break;
		case "5" :
			f.fposition = 5 ;
			break;
		case "6" :
			f.fposition = 6 ;
			break;
		case "7" :
			f.fposition = 7 ;
			break;
		}	
	}
	
	public static void main(String[] args) {
		Figure appli = new Figure();
		appli.setLocation(100, 100);
		appli.setSize(600, 600);
		appli.setVisible(true);
	}	
}
	

