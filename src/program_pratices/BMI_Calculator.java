package program_pratices;

public class BMI_Calculator {  //i have decleared class having a name  of programe practice 
	
	String Name;
	int Age;      //logic 
	double Weight;
	double HeightM;
	double HeightCM;
	double BMI;
	
	BMI_Calculator(String Name, int Age, double Weight, double HeightCM){
		this.Name = Name;
		this.Age = Age;
		this.Weight = Weight;
		this.HeightCM = HeightCM;
		HeightM = HeightCM/100;
		BMI = (Weight/(HeightM * HeightM))-((Weight%(HeightM*HeightM))/(HeightM*HeightM));  // This formula is only for this code to convert large float values in two digit values
	}
	
	public void information() {
		System.out.println("\n" + "------Welcome to BMI Calculator------" + "\n");
		System.out.println("Your name is : " + Name + "\n" + "Your age is : " + Age
							+ " Years" + "\n" + "Your weight is : " + Weight + " Kg" + "\n" + "Your height is : " + HeightCM
							+ " cm"+ "\n" + "Your BMI is : " + BMI + "\n");
			
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
		
		BMI_Calculator Manisha = new BMI_Calculator("Manisha", 28, 48, 157);
		Manisha.information();
		Manisha.status();
	}

}




