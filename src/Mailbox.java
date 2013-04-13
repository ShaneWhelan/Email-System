import java.util.ArrayList;

public class Mailbox {
	private ArrayList<Message> mail = new ArrayList<Message>();
	private String user;
	
	public void storeMessage(Message message){
		mail.add(message);
	}
	
	public void printAllMessages(Message message){
		for(int i = 0; i < mail.size(); i++){
			System.out.println(mail.get(i));
		}
	}
	
	public String getUser(){
		return user;
	}
	
	public void setUser(String user){
		this.user = user;
	}
}