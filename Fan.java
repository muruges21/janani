public class Fan {
	static final int slow = 1;
	static final int medium = 2;
	static final int fast = 3;

	private int speed = slow;
	private boolean on = false;
	private double radius = 50;
	private String color = "red";
	

	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public boolean isOn() {
		return on;
	}


	public void setOn(boolean on) {
		this.on = on;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public static int getSlow() {
		return slow;
	}


	public static int getMedium() {
		return medium;
	}


	public static int getFast() {
		return fast;
	}
	public void tostring()
	 {
		System.out.println("speed \t" +speed +"status \t" + on +"radius \t" +radius +"color \t" + color); 
	 }


	public static void main(String[] args) {
	  Fan f=new Fan();
	  f.tostring();
  
	}

}
