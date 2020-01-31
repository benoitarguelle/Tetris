import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Figure extends Frame implements ActionListener, ItemListener{
	
	// DECLARATION DES ATTRIBUTS
	private Color couleurFigure ;
	private Forme f ;
	private int numJoueur ;
	private int numFig ;
	private Choice orientation ;
	private Choice position ;
	private Button validation ;
	
	public Figure(int numFig, int numJoeur) {
		couleurFigure = coloriage(numJoueur);
		
		setLayout(new FlowLayout());   
		
		orientation = new Choice() ;
		orientation.add("à l'endroit");
		orientation.add("à l'envers");
		orientation.add("rotation à gauche");
		orientation.add("rotation à droite");
		orientation.addItemListener(this);
		
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
	
	public Color coloriage(int numJoueur) {
		if (numJoueur==0) {return Color.orange ;}
		else {return Color.cyan ;}
	}

	 public void paint(Graphics g)  {
		// récupération des dimensions de l'application :
		int w = getSize().width; 
		int h = getSize().height;
		    g.setColor(couleurCarre);
		    g.fillRect(w/2-rayon, h/2-rayon, 2*rayon, 2*rayon);
		    // dessin du disque :
		    g.setColor(couleurCercle);
		    g.fillOval(w/2-rayon, h/2-rayon, 2*rayon, 2*rayon);
		  }	
	
	
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == validation) {
			//// APPPEL AU PROGRAMME POUR METTRE A JOUR LA GRILLE
			f = new Forme() ;
			numJoueur = (numJoueur+1)%2 ;
		}
	}	
	
	public void itemStateChanged(ItemEvent evt) {
		switch (orientation.getSelectedItem()) {
		case "à l'endroit" :
			f.forientation = 0 ;
		case "rotation à gauche" :
			f.forientation = 1 ;
		case "à l'envers" :
			f.forientation = 2 ;
		case "rotation à droite" :
			f.forientation = 3 ;
		}
		
		switch (position.getSelectedItem()) {
		case "0" :
			f.fposition = 0 ;
		case "1" :
			f.fposition = 1 ;
		case "2" :
			f.fposition = 2 ;
		case "3" :
			f.fposition = 3 ;
		case "4" :
			f.fposition = 4 ;
		case "5" :
			f.fposition = 5 ;
		case "6" :
			f.fposition = 6 ;
		case "7" :
			f.fposition = 7 ;
		}
		
	}
	
	public static void main(String[] args) {
		AppliDisque appli = new AppliDisque();
		appli.setLocation(100, 100);
		appli.setSize(600, 600);
		appli.setVisible(true);
	}	
}
	

