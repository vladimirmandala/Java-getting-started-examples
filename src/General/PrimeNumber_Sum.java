package General;

//Write a program to find the sum of the first 1000 prime numbers

public class PrimeNumber_Sum {
	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		long sum = 0;
		while (count < 10) {
			if (isPrimeNumber(number)) {
				System.out.println("Prime Number "+number);
				sum += number;
				count++;
			}
			number++;
		}
		System.out.println(sum);
	}

	private static Boolean isPrimeNumber(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}