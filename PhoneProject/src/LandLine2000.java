/*
 * Standard functionality*. Cannot stream live video.
 */
//The class LandLine2000 is a subclass of phone and we also tell it to implement the interface communicatable 
public class LandLine2000 extends Phone implements Communicatable{
	
	//Constructor
	public LandLine2000(){
		
		//This calls the blank constructor from my phone method - for defaults	
		super();	
	}
	
	//Constructor
	public LandLine2000(String name, int noOfDisplayPixels, float width, 
			float height, float weight, boolean isPoweredOn, boolean isRecharging){
		
		//Calls the constructor in the super class and passes 
		super(name, noOfDisplayPixels, width, height, weight, isPoweredOn, isRecharging);
		
	}

	
	//Overriding the toString method to get proper output when the object is printed and formatting the text for output
	@Override
	public void makeCall(String noToDial) {

		System.out.println("Dialing number " + noToDial + " on a LandLine2000 Phone...");
		
	}

	@Override
	public void receiveCall(String incomingPhoneNo) {
		
		System.out.println("Incoming call from " + incomingPhoneNo + " on a LandLine2000 Phone...");
		
		
	}

	@Override
	public void sendText(String messageToSend, String noToText) {
		
		System.out.println("Text Message Sent: " + messageToSend + "\n" + "Sent to: " + noToText);
		
	}

	@Override
	public void receiveText(String message, String incomingPhoneNo) {

		System.out.println("Text Message Received: " + message + "\n"  + "From: " + incomingPhoneNo);
		
	}

	@Override
	public void recharge(boolean status) {

		//this tests to see if the phone is charging using a boolean and if it is it prints out the output below
		if (true){
			System.out.println("LandLine2000 is currently recharging...\n");
		}
		//else do nothing
	}

	@Override
	public void hangUp() {

		//this tests to see if the phone call has been terminated using a boolean and if it is it prints out the output below
		if (true){
			System.out.println("Call terminated on a LandLine 2000 phone...");
		}
		//else do nothing
		
	}
}

