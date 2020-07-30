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
		System.out.print("Please enter an odd integer defining the size (length x width) of the figure:");
		
		Scanner scan = new Scanner(System.in);
		
		size = scan.nextInt();
		

		if (size%2 == 0) {  //"invalid" comment when even number is entered
		 System.out.println("Invalid figure size- must be an odd number");
		 System.out.println();
		 System.out.println("Reenter the size of the figure: ");
			
		 size = scan.nextInt();
			}
		
		if (size%2 != 0)   //Present menu to user 
			
			System.out.println();
			System.out.println("MENU: \n1. Print Box \n2. Print Diamond \n3. Print X \n4. Quit Program \n");
			System.out.print("Please select an option: ");
			
			selection = scan.nextInt();
			
		while (selection != 4)
		{
			switch (selection) {
				case 1:
					Figures Box = new Figures();
					Box.size = size;
					System.out.println();
					Box.printBox();
					System.out.println();
					break;
				case 2:
					Figures Diamond = new Figures();
					Diamond.size = size;
					System.out.println();
					Diamond.printDiamond();
					System.out.println();
					break;
				case 3:
					Figures X = new Figures();
					X.size = size;
					System.out.println();
					X.printX();
					System.out.println();
					break;
			}
		
		if (selection == 4)
			System.out.println("Good bye!");
			scan.close();
			}
	}

//Establishes the printX method printing "X"
	public void printX() {

		for (int row = 0; row < size; row++) {

			for (int col= 0; col < size; col++) {
				if (col == row || col == (size - (row+1))) {
					System.out.print("X");
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