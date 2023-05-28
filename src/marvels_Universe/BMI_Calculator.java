package marvels_Universe;

	

	public class BMI_Calculator {
		
		String Name;
		int Age;
		int Weight;
		int HeightM;
		int HeightCM;
		int BMI;
		
		BMI_Calculator(String Name, int Age, int Weight, int HeightCM){
			this.Name = Name;
			this.Age = Age;
			this.Weight = Weight;
			this.HeightCM = HeightCM;
			HeightM = HeightCM/100;
			BMI = Weight/(HeightM^2);
		}
		
		public void information() {
			System.out.println("------Welcome to BMI Calculator------" + "\n");
			System.out.println("Your name is : " + Name + "\n" + "Your age is : " + Age
								+ "\n" + "Your weight is : " + Weight + "\n" + "Your height is : " + HeightCM
								+ "\n" + "Your BMI is : " + BMI + "\n");
				
		}
		
		public void status() {
			if(BMI>= 9 && BMI<=65) {
				
				if (BMI>=9 && BMI<=18) {
				System.out.println("You are underweight");
				System.out.println("You have to increase your weight");
				}
				
				if (BMI>= 19 && BMI<=24) {
					System.out.println("You are healthy");
					System.out.println("Very good, Keep maintaining your health");
				}
				
				if (BMI>= 25 && BMI<= 29) {
					System.out.println("You are overweight");
					System.out.println("Loose your weight");
				}
				
				if (BMI>= 30 && BMI<=39) {
					System.out.println("You are obese");
					System.out.println("Kashala khato re evdh jara workout kr!");
				}
				
				if (BMI>= 40 && BMI<=65) {
					System.out.println("You are extremely obese");
					System.out.println("Kha kha ajun ani mar redya!!!");
				}
			}else {
				System.out.println("You have provided invalid data");
				System.out.println("Are jara baghun bhar ki bala!!!!");
			}
		}
		
		public static void main(String[]args) {
			BMI_Calculator Shivaji = new BMI_Calculator("Shivaji", 25, 60, 183);
			Shivaji.information();
			Shivaji.status();
		}
	}

	


