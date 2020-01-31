import java.awt.Color;

public class Forme {
	
	int fposition;
	int fsens;
	String type;
	Color[] fcolor;
	
	
	public Forme() {
		int a = (int)Math.floor(Math.random()*6);
		switch (a) {
		case 0:
			type= "I";
			break;
		case 1:
			type= "O";
			break;
		case 2: 
			type = "T";
			break;
		case 3:
			type = "L";
			break;
		case 4:
			type = "J";
		case 5: 
			type = "S";
		}
		fsens= 0;
		fposition= 0;
		fcolor= new Color[4];
		for (int i =0; i<4; i++) {
			if (Math.random()<0.5) {
				fcolor[i]= Color.ORANGE;
			}
			else {
				fcolor[i]= Color.cyan;
			}
		}
		
	} 
}

