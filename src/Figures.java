
public class Figures {

	private static int size = 0;
	private static char c;

//Constructor method
	public void Figures(int size) {
	}

//Main method
	public static void main(String[] args) {

		Figures Box = new Figures();
		Box.size =10;
		Box.printBox();
		
	}

//Establishes the printBox method printing "*"
	public void printBox() {

		for (int l = 0; l < size; l++) {
			for (int w = 0; w < size; w++) {
				System.out.print("*");
			}
			System.out.println();
		}

	
	}}
