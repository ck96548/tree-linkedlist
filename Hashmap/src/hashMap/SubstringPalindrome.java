package hashMap;

public class SubstringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd";
		
		subStringPalindrome(str);

	}
	
	

	private static void subStringPalindrome(String str) {
		for(int i = 0 ; i < str.length();i++) {
			
			for (int j = i; j <= str.length(); j++) {
							
					System.out.println(str.substring(i,j));
		
			}
		}
		
	}

}
