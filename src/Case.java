import java.awt.Color;

public class Case {
	
	Color color; 
	boolean Case_remplie;
	
	
	public Case(){
		Case_remplie = false;
		color= Color.WHITE;
	}
	
	public Case(Color c) {
		Case_remplie=true;
		color=c;
	}
}
