package assignment;

public class Swap {
public static void main(String[] args) {
	String str="Stirngvalue";
		int i = 0;
			for(char c: str.toCharArray()) {
			i++;
			}
			System.out.println("Length of the given string ::"+i);
			//
			
			String str1 ="Jaikishan";
			int len = str1.length();
			String rev = " ";
			for(int j=len-1 ; j>=0 ; j--){
			rev = rev + str1.charAt(j);
			}
			System.out.println(rev);
}
}
