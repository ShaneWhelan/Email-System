//import java.util.Scanner;

public class Menu {
	public void display(String s, MessagingSystem sys){
		System.out.println("Log I)n\tS)end Message\tR)ead messages\tLog O)ut\tQ)uit");
		//Scanner input = new Scanner(System.in);
		if(s == "I"){
			System.out.println("User name:" );
			//Mailbox box = sys.logIn(input.nextLine());
		}else if(s == "S"){
			System.out.println("Mail to:");
			//box.storeMessage().setRecipient(s).set;
		}else if(s == "R"){
			//System.out.println(sys.printAllMessages());
		}else if(s == "O"){
			
		}
	}
}
