
public class Figures {

	private static int size = 0;
	private static char c;

//Constructor method
	public void Figures(int size) {
	}

//Main method
	public static void main(String[] args) {

		Figures Box = new Figures();
		Box.size = 11;
		Box.printBox();

		Figures X = new Figures();
		X.size = 11;
		X.printX();
		
		Figures Diamond = new Figures();
		Diamond.size = 11;
		Diamond.printDiamond();
	}

//Establishes the printX method printing "*"
	public void printX() {

		for (int row = 0; row < size; row++) {

			for (int col= 0; col < size; col++) {
				if (col == row || col == (size - (row+1))) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

//Establishes the printBox method printing "*"
	public void printBox() {

		for (int l = 0; l < size; l++) {
			for (int w = 0; w < size; w++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
//Establishes the printDiamond method printing "*"
	public void printDiamond() {
		
		for (int row = 0; row < size; row++) {

			for (int col= 0; col < size; col++) {
				if (row+col == size/2 || col ==row+(size/2) || row+col==(size-1)+(size/2) || row==(col-1)+(size/2)){
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		
	}
	
}
}