package General;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 23;
		int count = 0;
		long sum = 0;
		
			if (isPrimeNum(number)) {
				System.out.println("Prime Number "+count+" "+number);
				count++;
			}else{
				System.out.println("is not a primary number - "+number);
			}
	}

	public static boolean isPrimeNum(int number){
		boolean temp = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				temp = false;
			}
		}
		return temp;
	}
}


