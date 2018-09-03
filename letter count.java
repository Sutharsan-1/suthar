import java.util.Scanner;
public class Main {
    
 public static void main(String[] args) {
		String test = "laptop is good";
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
		}
		System.out.println("laptop is good");
		System.out.println("letter: " + letter);
			}
}
