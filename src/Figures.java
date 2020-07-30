import java.util.Scanner;

public class Figures {

	private static int size = 0;
	private static int selection;

//Constructor method
	public void Figures(int size) {
	}

//Main method
	public static void main(String[] args) {

		//Prompting user to input figure size (length x width)
		System.out.print("Please enter an odd integer defining the size (length x width) of the figure");
		
		Scanner scan = new Scanner(System.in);
		
		size = scan.nextInt();

		do {
			
			
			//Presents menu to user 
			System.out.println("MENU: \n1. Print Box \n2. Print Diamond \n3. Print X \n4. Quit Program \n");
			System.out.print("Please select an option: ");
			
			selection = scan.nextInt();
			
			switch (selection) {
			case 1:
				Figures Box = new Figures();
				Box.size = size;
				Box.printBox();
				System.out.println();
				break;
			case 2:
				Figures Diamond = new Figures();
				Diamond.size = size;
				Diamond.printDiamond();
				System.out.println();
				break;
			case 3:
				Figures X = new Figures();
				X.size = size;
				X.printX();
				System.out.println();
				break;
			default:
				
				
			}
		} while (selection<=4);	
		
	
		
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

//Establishes the printBox method printing "X"
	public void printBox() {

		for (int l = 0; l < size; l++) {
			for (int w = 0; w < size; w++) {
				System.out.print("X");
			}
			System.out.println();
		}

	}
	
//Establishes the printDiamond method printing "X"
	public void printDiamond() {
		
		for (int row = 0; row < size; row++) {

			for (int col= 0; col < size; col++) {
				if (row+col == size/2 || col ==row+(size/2) || row+col==(size-1)+(size/2) || row==(col-1)+(size/2)){
					System.out.print("X");
				} else
					System.out.print(" ");
			}
			System.out.println();
		
	}
	
}
}