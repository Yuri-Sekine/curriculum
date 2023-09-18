package check;

import constants.Constants;

public class Main {
	
	public static void main(String[] args) {
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		System.out.println("printNameメソッド→" + printName(firstName, lastName));
		pet.introduce();
		robotPet.introduce();
	}
	
	private String firstName = "関根";
	private String lastName = "結理";
	
	private String printName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		return firstName + lastName;
	}
}