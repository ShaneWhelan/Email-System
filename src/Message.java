
public class Message {
	private String recipient;
	private String messageText;
	
	public String getRecipient(){
		return recipient;
	}
	
	public void setRecipient(String s){
		recipient = s;
	}
	public void print(){
		System.out.println(messageText);
	}
	
	public String read(){
		return messageText;
	}
}
