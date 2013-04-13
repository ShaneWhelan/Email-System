import java.util.Scanner;

public class Simulation {
	public static void main(String[] args){
		MessagingSystem sys = new MessagingSystem();
		Menu mailMenu = new Menu();
		Scanner input = new Scanner(System.in);
		while(input.next() != "Q"){
			mailMenu.display(input.next(), sys);
		}
	}
}
