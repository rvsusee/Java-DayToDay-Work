package dailywork;
import java.util.Scanner;
public class Currency {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		while(true) {
			System.out.print("Enter Input : ");
			String input=userinput.next();
			int count=input.length();
	
			if(count>3) {
				if((count%2)==0){
					
					for(int i=0;i<count-2;i++) {
						System.out.print(input.charAt(i)+","+input.charAt((i+1)));
						i++;
					}
					System.out.println(input.charAt(input.length()-2)+""+input.charAt(input.length()-1));
				}
				
				else if((count%2)!=0){
					for(int i=0;i<count-3;i++) {
						System.out.print(input.charAt(i)+""+input.charAt((i+1))+",");
						i++;
					}
					System.out.println(input.charAt(input.length()-3)+""+input.charAt(input.length()-2)+""+input.charAt(input.length()-1));
				}
			}else {
				System.out.println(input);
			}
		}
	}
}