package check;

import constants.Constants;

public class Main {
	public static void main(String[] args) {
//	課題③
		Pet petIntroduce = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPetIntroduce = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		System.out.println("printNameメソッド ⇒ " + fullName());
		
		petIntroduce.introduce();
		robotPetIntroduce.introduce();
	}


//	課題①
	private static String lastName ="隆洋";
	private static String firstName ="松田" ;
//	課題②
	private static String fullName() {
		return firstName + lastName;
		
	

	}
}
