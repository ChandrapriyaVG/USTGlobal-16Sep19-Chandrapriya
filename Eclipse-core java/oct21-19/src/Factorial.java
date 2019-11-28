
public class Factorial {
	public static void main(String[] args) {
		int num = 6;
		int factorial = multiplyNumbers(num);
		System.out.println("Factorial of "+num+" = "+factorial);
	}
	static int multiplyNumbers(int num)
	{
		if (num >= 1) {
			return num * multiplyNumbers (num - 1);

		}else
		{
			return 1;
		}
	}
}