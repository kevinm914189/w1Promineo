package week1.Promineo;

public class VariablesOpenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1
		boolean a = true;
		System.out.println("1. " + a);
//2
		double itemPrice = 1.1;
		System.out.println("2. " + itemPrice);		
//3
		String fullName = "KJM";
		System.out.println("3. " + fullName);
//4
        char middleInitial = 'J' ;
        System.out.println("4. " + middleInitial);
//5
		boolean isHotOutside = false;
		System.out.println("5. " + isHotOutside);
//6
		int age = 24;
		System.out.println("6. " + age);
//7
		double w = 6.0;
		double h = 4.0;
		double area = (w * h);
		System.out.println("7. " + area);
//8
		int x = 3;
		int y = 5;
        int z = x + y;
        x = z - x;
        y = z - y;
        System.out.println("8. " + z);
//9
        double radius = 12.75;
        double PI = 3.14159;
        double area1 = PI * radius * radius;
        System.out.println("9. " + area1);
//10
        int num1 = 10;
        int num2 = 20;
        final int MAX_VALUE = num1; 
        System.out.println("10. " + MAX_VALUE);
        final int NEW_MAX_VALUE = num2;
        System.out.println("    " + NEW_MAX_VALUE);
	}

}
