package selenium;

public class CountDigits {

	public static void main(String[] args) {
		int num = 25216;
		int i=0;
		while(num!=0) {
			int abc = num/10;
			num=abc;
			i=i+1;
		}
		System.out.println("Number of digits are "+i);
	}
	
}
