package week1.Promineo;

public class OperationsOpenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1
		int num1 = 10;
		int num2 = 10;
		 int multiplyResults = num1 * num2;
	System.out.println("1. " + multiplyResults);	
//2
	String firstName = "Tom";
	String lastName = "Sawyer";
    String fullName = firstName + " " + lastName;
	System.out.println("2. " + fullName);	
//3
	int num11 = 5;
	int num12 = 5;
	int num13 = 5;
	int yourAnswer = ((num11 + num12) * num13);

	System.out.println("3. " + yourAnswer);	
//4
	double num21 = 10.5;
	double num22 = .5;
	double num23 = 2;
	double num24 = 2;
	double answer1 = num21 / num22;
	double answer2 = num23 * num24;
	double finalAnswer = answer1 + answer2;
	System.out.println("4. " + finalAnswer);	
//5
	int num51 = 10;
	int num52 = 2;
	int finalAnswer5 = num51 / num52;
	System.out.println("5. " + finalAnswer5);	
//6
	double num61 = 3;
	double num62 = 3;
	double num63 = 3;
	double myDivision = ((num61 / num62) / num63);
	System.out.println("6. " + myDivision);	
//7
	double taxRate = .25;
	double hoursWorked = 40;
	double hourlyRate = 17.52;
    double grossPay = hoursWorked * hourlyRate;
    double netPay = (grossPay - (taxRate * grossPay));
	System.out.println("7. " + grossPay + " & " + netPay);	
//8
	System.out.println("8. " + (50 % 25));	
//9
	int finalAnswer9 = -88 % 3;
	System.out.println("9. " + finalAnswer9);	
//10
    int myAnswer = ((15 * 2) % 5);
	System.out.println("10. " + myAnswer);	
	}

}
