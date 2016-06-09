//this is an interface and its job is specifying behaviours or methods that must be used in each class that implements it. 
public interface Communicatable {

	public void makeCall (String noToDial);
	public void receiveCall (String incomingPhoneNo);
	public void sendText (String messageToSend,String noToText);
	public void receiveText (String message, String incomingPhoneNo);
	public void recharge(boolean status);
	public void hangUp();
}
