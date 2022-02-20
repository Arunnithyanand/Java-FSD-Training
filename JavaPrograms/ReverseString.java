//25.	Write a program to reverse the String (use char [] or String built in method)

public class ReverseString {
	
		public static void main(String[] args) {
		String str =  "Yamaha Fazer";
		String reverse_str = StringFormatter.reverseString(str);
		System.out.println("Actual String: "+str);
		System.out.println("Reverse String: "+reverse_str);
		}
		}

		class StringFormatter {
		public static String reverseString(String str){
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
		}
		}

