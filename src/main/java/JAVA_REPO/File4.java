package JAVA_REPO;

//Simple Calculator using switch

public class File4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=80;
		int b=10;
		
		char operator='/';
		
		switch (operator) {
		case '+':
			System.out.println("Sum is "+(a+b));
			break;
		case '-':
			System.out.println("Difference is "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication is "+(a*b));
			break;
		case '/':
			System.out.println("deivision is "+(a/b));
			break;

		default:
			break;
		}

	}

}
