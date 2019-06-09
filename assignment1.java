import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args){
		System.out.println("A = 3  B = 4 A/B = " + (3 + 4));
		System.out.println("A = 333  B = 444 A/B = " + (333/445.0));
		System.out.printf("A = 333 B = 444 A/B = %.2f\n" , (333/445.0));
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Celsius degree : ");
		int celc = input.nextInt();
		System.out.printf("Celsius = %d, Fahrenheit = %d\n" , celc, (celc * 9/5)+ 32);
		System.out.println("Enter radius of a circle : ");
		float circ = input.nextFloat();
		System.out.printf("Radius of a circle = %.0f, Area = %.1f, Perimeter = %3f\n" , circ, ((Math.pow(circ, 2) * Math.PI)), (2 * Math.PI * circ));
		System.out.println("Enter the last digit of a series number : ");
		int numbers = input.nextInt();
		input.close();
	    int result = 0;
	    for(int i = 0 ; i <= numbers; i++) {
	        result += i;
	    } 
		System.out.printf("1 + 2 + 3 +... + %d = %d", numbers, result);
	}
}
