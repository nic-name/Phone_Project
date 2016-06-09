//Phone class 
public class Phone {
	//fields required by the phone class
	private String name;
	private int noOfDisplayPixels;
	private float width;
	private float height;
	private float weight;
	private boolean isPoweredOn;
	private boolean isRecharging;
	
	//Constructor
	public Phone(){		
	}
	
	//Constructor
	public Phone(String name, int noOfDisplayPixels, float width, 
			float height, float weight, boolean isPoweredOn, boolean isRecharging){
		
		this.name = name;
		this.noOfDisplayPixels = noOfDisplayPixels;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.isPoweredOn = isPoweredOn;
		this.isRecharging = isRecharging;
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfDisplayPixels() {
		return noOfDisplayPixels;
	}

	public void setNoOfDisplayPixels(int noOfDisplayPixels) {
		this.noOfDisplayPixels = noOfDisplayPixels;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isPoweredOn() {
		return isPoweredOn;
	}

	public void setPoweredOn(boolean isPoweredOn) {
		this.isPoweredOn = isPoweredOn;
	}

	public boolean isRecharging() {
		return isRecharging;
	}

	public void setRecharging(boolean isRecharging) {
		this.isRecharging = isRecharging;
	}
	
	//Overriding the toString method to get proper output when the object is printed
	@Override
	public String toString() {
		
		String functionalityText = 
				
						"**************** Test Phone Functionality ****************"
						+ "\n" + "Name: " + name
						+ "\n" + "No. of display pixels: " + noOfDisplayPixels
						+ "\n" + "Width: " + width
						+ "\n" + "Height: " + height
						+ "\n" + "Weight: " + weight
						+ "\n" + "Powered On?: " + isPoweredOn
						+ "\n" + "Recharging?: " + isRecharging + "\n" + "\n";
			
		System.out.print(functionalityText);
		return functionalityText;
	}
}
	