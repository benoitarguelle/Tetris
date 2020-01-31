
public class GrilleJeu {

	Case[][] Grille_de_jeu;
	
public GrilleJeu(){
	Grille_de_jeu = new Case[8][6];
}



public void AjoutForme(Forme f) {
	int colonne=f.fposition;
	int k= 0;
	switch(f.type) {
	case "I":
		if (f.fsens==2 || f.fsens==0) {
	while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
			(Grille_de_jeu[colonne+1][k].Case_remplie== false) && 
			(Grille_de_jeu[colonne+2][k].Case_remplie== false) &&
			(Grille_de_jeu[colonne+3][k].Case_remplie== false)&&
			(k<6)) {
				k=k+1;
			}
	for (int i=0; i<4; i++) {
		Grille_de_jeu[colonne+i][k].Case_remplie= true;
		Grille_de_jeu[colonne+i][k].color= f.fcolor[i];
		
	}		
		}
		else {
			while ((Grille_de_jeu[colonne][k].Case_remplie== false)&&  (k<6)) {
						k=k+1;
					}
			for (int i=0; i<4; i++) {
				Grille_de_jeu[colonne][k+i].Case_remplie= true;
				Grille_de_jeu[colonne][k+i].color= f.fcolor[i];
				
			}		
				}
		break;
	case "O":
		while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
			(Grille_de_jeu[colonne+1][k].Case_remplie== false) && 
			(k<=6)) {
			k=k+1;
		}
		k=k-1;
		Grille_de_jeu[colonne][k].Case_remplie= true;
		Grille_de_jeu[colonne][k].color= f.fcolor[0];
		Grille_de_jeu[colonne+1][k].Case_remplie= true;
		Grille_de_jeu[colonne+1][k].color= f.fcolor[1];
		Grille_de_jeu[colonne][k+1].Case_remplie= true;
		Grille_de_jeu[colonne][k+1].color= f.fcolor[2];
		Grille_de_jeu[colonne+1][k+1].Case_remplie= true;
		Grille_de_jeu[colonne+1][k+1].color= f.fcolor[3];
	
		break;
	
	
	case "T":
		if (f.fsens==2) {
			while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
					(Grille_de_jeu[colonne+1][k].Case_remplie== false) && 
						(Grille_de_jeu[colonne+2][k].Case_remplie== false)&&
							(k<=6)) {
								k=k+1;
		}
			k=k-1;
			Grille_de_jeu[colonne][k].Case_remplie= true;
			Grille_de_jeu[colonne][k].color= f.fcolor[1];
			Grille_de_jeu[colonne+1][k+1].Case_remplie= true;
			Grille_de_jeu[colonne+1][k+1].color= f.fcolor[0];
			Grille_de_jeu[colonne+1][k].Case_remplie= true;
			Grille_de_jeu[colonne+1][k].color= f.fcolor[2];
			Grille_de_jeu[colonne+2][k].Case_remplie= true;
			Grille_de_jeu[colonne+2][k].color= f.fcolor[3];
			
		}
		else {
			if (f.fsens==0) {
				while ((Grille_de_jeu[colonne][k].Case_remplie== false)&&
						(Grille_de_jeu[colonne+1][k+1].Case_remplie== false) && 
							(Grille_de_jeu[colonne+2][k].Case_remplie== false)&&
								(k<=6)) {
									k=k+1;
				
			}
				k=k-1;
				Grille_de_jeu[colonne][k].Case_remplie= true;
				Grille_de_jeu[colonne][k].color= f.fcolor[1];
				Grille_de_jeu[colonne+1][k-1].Case_remplie= true;
				Grille_de_jeu[colonne+1][k-1].color= f.fcolor[0];
				Grille_de_jeu[colonne+1][k].Case_remplie= true;
				Grille_de_jeu[colonne+1][k].color= f.fcolor[2];
				Grille_de_jeu[colonne+2][k].Case_remplie= true;
				Grille_de_jeu[colonne+2][k].color= f.fcolor[3];
		}
		
	}	
			if (f.fsens==1) {
				while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
							(Grille_de_jeu[colonne+1][k-1].Case_remplie== false)&&
								(k<=6)) {
									k=k+1;
				
			}
				k=k-1;
				Grille_de_jeu[colonne][k].Case_remplie= true;
				Grille_de_jeu[colonne][k].color= f.fcolor[1];
				Grille_de_jeu[colonne][k+1].Case_remplie= true;
				Grille_de_jeu[colonne][k+1].color= f.fcolor[0];
				Grille_de_jeu[colonne][k+2].Case_remplie= true;
				Grille_de_jeu[colonne][k+2].color= f.fcolor[2];
				Grille_de_jeu[colonne+1][k+1].Case_remplie= true;
				Grille_de_jeu[colonne+1][k+1].color= f.fcolor[3];
		}
		
			
			if (f.fsens==3) {
				while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
							(Grille_de_jeu[colonne+1][k+1].Case_remplie== false)&&
								(k<=6)) {
									k=k+1;
				}
				
				k=k-1;
				Grille_de_jeu[colonne][k].Case_remplie= true;
				Grille_de_jeu[colonne][k].color= f.fcolor[1];
				Grille_de_jeu[colonne+1][k-1].Case_remplie= true;
				Grille_de_jeu[colonne+1][k-1].color= f.fcolor[0];
				Grille_de_jeu[colonne+1][k+1].Case_remplie= true;
				Grille_de_jeu[colonne+1][k+1].color= f.fcolor[2];
				Grille_de_jeu[colonne+1][k+2].Case_remplie= true;
				Grille_de_jeu[colonne+1][k+2].color= f.fcolor[3];
				
			}

		
	
			break;
	case "L":
			if (f.fsens==0) {
				while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
							(Grille_de_jeu[colonne+1][k].Case_remplie== false)&&
							(Grille_de_jeu[colonne+2][k+1].Case_remplie== false)&&
								(k<=6)) {
									k=k+1;
				
			}
				k=k-1;
				Grille_de_jeu[colonne][k].Case_remplie= true;
				Grille_de_jeu[colonne][k].color= f.fcolor[1];
				Grille_de_jeu[colonne+1][k].Case_remplie= true;
				Grille_de_jeu[colonne+1][k].color= f.fcolor[0];
				Grille_de_jeu[colonne+2][k].Case_remplie= true;
				Grille_de_jeu[colonne+2][k].color= f.fcolor[2];
				Grille_de_jeu[colonne+2][k+1].Case_remplie= true;
				Grille_de_jeu[colonne+2][k+1].color= f.fcolor[3];
		}
			else if (f.fsens==1) {
				while ((Grille_de_jeu[colonne][k+2].Case_remplie== false)&& 
						(Grille_de_jeu[colonne+1][k+2].Case_remplie== false)&&
							(k<=6)) {
								k=k+1;
			
		}
			k=k-1;
			Grille_de_jeu[colonne][k].Case_remplie= true;
			Grille_de_jeu[colonne][k].color= f.fcolor[1];
			Grille_de_jeu[colonne][k+1].Case_remplie= true;
			Grille_de_jeu[colonne][k+1].color= f.fcolor[0];
			Grille_de_jeu[colonne][k+2].Case_remplie= true;
			Grille_de_jeu[colonne][k+2].color= f.fcolor[2];
			Grille_de_jeu[colonne+1][k+2].Case_remplie= true;
			Grille_de_jeu[colonne+1][k+2].color= f.fcolor[3];
	}
			else if (f.fsens==2) {
				while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
							(Grille_de_jeu[colonne+1][k].Case_remplie== false)&&
							(Grille_de_jeu[colonne+2][k].Case_remplie== false)&&
								(k<=6)) {
									k=k+1;
				
			}
				k=k-1;
				Grille_de_jeu[colonne][k].Case_remplie= true;
				Grille_de_jeu[colonne][k].color= f.fcolor[1];
				Grille_de_jeu[colonne+1][k].Case_remplie= true;
				Grille_de_jeu[colonne+1][k].color= f.fcolor[0];
				Grille_de_jeu[colonne+2][k].Case_remplie= true;
				Grille_de_jeu[colonne+2][k].color= f.fcolor[2];
				Grille_de_jeu[colonne+2][k-1].Case_remplie= true;
				Grille_de_jeu[colonne+2][k-1].color= f.fcolor[3];
		}
			else if (f.fsens==3) {
				while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
						(Grille_de_jeu[colonne+1][k+2].Case_remplie== false)&&
							(k<=6)) {
								k=k+1;
			
		}
			k=k-1;
			Grille_de_jeu[colonne][k].Case_remplie= true;
			Grille_de_jeu[colonne][k].color= f.fcolor[1];
			Grille_de_jeu[colonne+1][k].Case_remplie= true;
			Grille_de_jeu[colonne+1][k].color= f.fcolor[0];
			Grille_de_jeu[colonne+1][k+1].Case_remplie= true;
			Grille_de_jeu[colonne+1][k+1].color= f.fcolor[2];
			Grille_de_jeu[colonne+1][k+2].Case_remplie= true;
			Grille_de_jeu[colonne+1][k+2].color= f.fcolor[3];
	}
			break;
	case "J" : 
		if (f.fsens==0) {
			while ((Grille_de_jeu[colonne][k+1].Case_remplie== false)&& 
						(Grille_de_jeu[colonne+1][k].Case_remplie== false)&&
						(Grille_de_jeu[colonne+2][k].Case_remplie== false)&&
							(k<=6)) {
								k=k+1;
			
		}
			k=k-1;
			Grille_de_jeu[colonne][k].Case_remplie= true;
			Grille_de_jeu[colonne][k].color= f.fcolor[1];
			Grille_de_jeu[colonne+1][k].Case_remplie= true;
			Grille_de_jeu[colonne+1][k].color= f.fcolor[0];
			Grille_de_jeu[colonne+2][k].Case_remplie= true;
			Grille_de_jeu[colonne+2][k].color= f.fcolor[2];
			Grille_de_jeu[colonne][k+1].Case_remplie= true;
			Grille_de_jeu[colonne][k+1].color= f.fcolor[3];
	}
		else if (f.fsens==1) {
			while ((Grille_de_jeu[colonne][k+2].Case_remplie== false)&& 
					(Grille_de_jeu[colonne+1][k].Case_remplie== false)&&
						(k<=6)) {
							k=k+1;
		
	}
		k=k-1;
		Grille_de_jeu[colonne][k].Case_remplie= true;
		Grille_de_jeu[colonne][k].color= f.fcolor[1];
		Grille_de_jeu[colonne][k+1].Case_remplie= true;
		Grille_de_jeu[colonne][k+1].color= f.fcolor[0];
		Grille_de_jeu[colonne][k+2].Case_remplie= true;
		Grille_de_jeu[colonne][k+2].color= f.fcolor[2];
		Grille_de_jeu[colonne+1][k].Case_remplie= true;
		Grille_de_jeu[colonne+1][k].color= f.fcolor[3];
}
		else if (f.fsens==2) {
			while ((Grille_de_jeu[colonne][k+1].Case_remplie== false)&& 
						(Grille_de_jeu[colonne+1][k+1].Case_remplie== false)&&
						(Grille_de_jeu[colonne+2][k+1].Case_remplie== false)&&
							(k<=5)) {
								k=k+1;
			
		}
			k=k-1;
			Grille_de_jeu[colonne][k].Case_remplie= true;
			Grille_de_jeu[colonne][k].color= f.fcolor[1];
			Grille_de_jeu[colonne][k+1].Case_remplie= true;
			Grille_de_jeu[colonne][k+1].color= f.fcolor[0];
			Grille_de_jeu[colonne+1][k+1].Case_remplie= true;
			Grille_de_jeu[colonne+1][k+1].color= f.fcolor[2];
			Grille_de_jeu[colonne+2][k+1].Case_remplie= true;
			Grille_de_jeu[colonne+2][k+1].color= f.fcolor[3];
	}
		else if (f.fsens==3) {
			while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
					(Grille_de_jeu[colonne+1][k].Case_remplie== false)&&
						(k<=6)) {
							k=k+1;
		
	}
		k=k-1;
		Grille_de_jeu[colonne][k].Case_remplie= true;
		Grille_de_jeu[colonne][k].color= f.fcolor[1];
		Grille_de_jeu[colonne+1][k].Case_remplie= true;
		Grille_de_jeu[colonne+1][k].color= f.fcolor[0];
		Grille_de_jeu[colonne+1][k-1].Case_remplie= true;
		Grille_de_jeu[colonne+1][k-1].color= f.fcolor[2];
		Grille_de_jeu[colonne+1][k-2].Case_remplie= true;
		Grille_de_jeu[colonne+1][k-2].color= f.fcolor[3];
}
	case "Z" : 
		if (f.fsens==0 || f.fsens==2) {
			while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
					(Grille_de_jeu[colonne+1][k+1].Case_remplie== false)&&
					(Grille_de_jeu[colonne+2][k+1].Case_remplie== false)&&
						(k<=5)) {
							k=k+1;
		
	}
		k=k-1;
		Grille_de_jeu[colonne][k].Case_remplie= true;
		Grille_de_jeu[colonne][k].color= f.fcolor[1];
		Grille_de_jeu[colonne+1][k].Case_remplie= true;
		Grille_de_jeu[colonne+1][k].color= f.fcolor[0];
		Grille_de_jeu[colonne+1][k+1].Case_remplie= true;
		Grille_de_jeu[colonne+1][k+1].color= f.fcolor[2];
		Grille_de_jeu[colonne+2][k+1].Case_remplie= true;
		Grille_de_jeu[colonne+2][k+1].color= f.fcolor[3];
}
		if (f.fsens==1 || f.fsens==3) {
			while ((Grille_de_jeu[colonne][k+1].Case_remplie== false)&& 
					(Grille_de_jeu[colonne+1][k+2].Case_remplie== false)&&
						(k<=4)) {
							k=k+1;
		
	}
		k=k-1;
		Grille_de_jeu[colonne][k].Case_remplie= true;
		Grille_de_jeu[colonne][k].color= f.fcolor[0];
		Grille_de_jeu[colonne+1][k].Case_remplie= true;
		Grille_de_jeu[colonne+1][k].color= f.fcolor[1];
		Grille_de_jeu[colonne+1][k+1].Case_remplie= true;
		Grille_de_jeu[colonne+1][k+1].color= f.fcolor[2];
		Grille_de_jeu[colonne+2][k+1].Case_remplie= true;
		Grille_de_jeu[colonne+2][k+1].color= f.fcolor[3];
	}
	
	

	break; 
	
	case "S":
		if (f.fsens==0 || f.fsens==2) {
			k=1;
			while ((Grille_de_jeu[colonne][k].Case_remplie== false)&& 
					(Grille_de_jeu[colonne+1][k].Case_remplie== false)&&
					(Grille_de_jeu[colonne+2][k-1].Case_remplie== false)&&
						(k<=6)) {
							k=k+1;
		
	}
		k=k-1;
		Grille_de_jeu[colonne][k].Case_remplie= true;
		Grille_de_jeu[colonne][k].color= f.fcolor[2];
		Grille_de_jeu[colonne+1][k].Case_remplie= true;
		Grille_de_jeu[colonne+1][k].color= f.fcolor[3];
		Grille_de_jeu[colonne+1][k-1].Case_remplie= true;
		Grille_de_jeu[colonne+1][k-1].color= f.fcolor[0];
		Grille_de_jeu[colonne+2][k-1].Case_remplie= true;
		Grille_de_jeu[colonne+2][k-1].color= f.fcolor[1];
}
		if (f.fsens==1 || f.fsens==3) {
			while ((Grille_de_jeu[colonne][k+1].Case_remplie== false)&& 
					(Grille_de_jeu[colonne+1][k].Case_remplie== false)&&
						(k<=5)) {
							k=k+1;
		
	}
		k=k-1;
		Grille_de_jeu[colonne][k].Case_remplie= true;
		Grille_de_jeu[colonne][k].color= f.fcolor[1];
		Grille_de_jeu[colonne+1][k].Case_remplie= true;
		Grille_de_jeu[colonne+1][k].color= f.fcolor[0];
		Grille_de_jeu[colonne+1][k+1].Case_remplie= true;
		Grille_de_jeu[colonne+1][k+1].color= f.fcolor[2];
		Grille_de_jeu[colonne+2][k+1].Case_remplie= true;
		Grille_de_jeu[colonne+2][k+1].color= f.fcolor[3];
	}		

}

}

}


	





