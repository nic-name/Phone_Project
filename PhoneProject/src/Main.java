import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		//using the constructors to set each phone's fields
		LandLine2000 phoneOne = new LandLine2000("LandLine", 400, 5.6f, 8.5f, 80.5f, true, false);
		G200 phoneTwo = new G200("G200", 510, 4.5f, 8.6f, 80.5f, true, false);		
		
		//create an array list of type Phone and add both phones
		ArrayList <Phone> phoneList = new ArrayList<>();
		phoneList.add(phoneOne);
		phoneList.add(phoneTwo);
		
		//Using an enhanced for loop iterate through the array list and call on the methods below
		for (Phone p : phoneList){
			
			//checking if the object is of type LandLine2000
			if(p instanceof LandLine2000){
				LandLine2000 l =(LandLine2000) p;
				
				l.toString();
				l.makeCall("0874646372");
				l.receiveCall("0864546342");
				l.hangUp();
				l.sendText("Hi very warm", "0874546432");
				l.receiveText("Lucky you!", "0864545454");
				l.recharge(true);
			}
			//checking if the object is of type G200
			if(p instanceof G200){
				G200 g = (G200) p;
				
				g.toString();
				g.makeCall("0874646372");
				g.receiveCall("0864546342");
				g.hangUp();
				g.sendText("Hi very warm", "0874546432");
				g.receiveText("Lucky you!", "0864545454");
				g.recharge(true);
				g.streamVideo();
			}
		}

	}//end main()

}
