
public class isSumEqual {
	public static void main(String[] args) {
		String firstWord = "j"; 
		String secondWord = "j";
		String targetWord = "bi";
		int sum1 = 0;
		
		for(int i = 0; i < firstWord.length(); i++) {
			int y = firstWord.charAt(i)-'a';
			
			sum1 = sum1
					*10 + y;
			
		}
		int sum = 0;
		for(int i = 0; i < secondWord.length(); i++) {
			int y = secondWord.charAt(i)-'a';
			sum = sum *10 + y;
		}
		sum1 = sum + sum1;
		sum =0;
		for(int i = 0; i < targetWord.length(); i++) {
			int y = targetWord.charAt(i)-'a';
			sum = sum *10 + y;
		}
		boolean ans = false;
		if(sum1 == sum) {
			ans = true;
			System.out.println(ans);
		}
		else System.out.println(ans);
		
	}

}
