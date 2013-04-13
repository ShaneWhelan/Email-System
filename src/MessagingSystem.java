import java.util.ArrayList;

public class MessagingSystem{
	ArrayList<Mailbox> mailboxes = new ArrayList<Mailbox>();
	
	public void deliver(Message mail){
		Mailbox box = getMailbox(mail);
		box.storeMessage(mail);
	}
	
	public Mailbox logIn(String s){
		for(int i = 0; i < mailboxes.size(); i++){
			if(mailboxes.get(i).getUser() == s){
				 return mailboxes.get(i);
			}
		}
		return null;
	}
	
	public Mailbox getMailbox(Message mail){
		for(int i = 0; i < mailboxes.size(); i++){
			if(mail.getRecipient() == mailboxes.get(i).getUser()){
				return mailboxes.get(i);
			}
		}
		Mailbox box = new Mailbox();
		box.storeMessage(mail);
		box.setUser(mail.getRecipient());
		mailboxes.add(box);
		return mailboxes.get(mailboxes.size() - 1);
	}
	
	public void printMessage(Mailbox box){
		
	}
}
