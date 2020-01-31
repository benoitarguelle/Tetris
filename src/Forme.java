
public class Forme {
	
	int fposition;
	int fsens;
	String type;
	
	
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
	} 
}

