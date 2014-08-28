package General;

public class StringReverse {
	public static void main(String[] args) {
		String str = "15";
		String newStr="";
		int i = str.length();
		for (int j=i-1;j>=0;j--){
			newStr+=str.charAt(j);
			System.out.println(newStr);
		}
		int abc = Integer.parseInt(newStr);
		System.out.println(++abc);
	}
}
