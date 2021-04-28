import java.util.Scanner;
public class TelevisionDemo2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the brand of your television?");
		String newBrand = keyboard.nextLine();
		
		Television myTelevision = new Television(newBrand);
		int option;
		
		do {
			System.out.println("Press 1 to change the power status of the televsion");
			System.out.println("Press 2 to check the power status of the television");
			System.out.println("Press 3 to end the program");
			option = keyboard.nextInt();
			
			if(option == 1) {
				System.out.println("Press 0 to turn the tv off or Press 1 to turn the tv on");
				int newPower = keyboard.nextInt();
				myTelevision.setPower(newPower);
			}
			else if(option == 2) {
				int power = myTelevision.getPower();
				if(power == 0) {
					System.out.println("The Television is off");
				}
				else {
					System.out.println("The Television is on");
				}
			}
			else if(option == 3) {
				System.out.println("Thank you for using our program");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 3);

	}

}
