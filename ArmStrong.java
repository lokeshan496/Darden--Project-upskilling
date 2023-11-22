package practices;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
		Scanner num1=new Scanner(System.in);
		 System.out.println(" enter the number");
		int num=num1.nextInt();
		int oN=0;
		int remi=0;
		int res=0;
		oN=num;
		while(oN!=0) {
			remi=oN%10;
			res+=Math.pow(remi, 3);
			oN/=10;
		}
		if(res==num) {
			System.out.println(num+" is an armstrong number");
		}
		else
			System.out.println(num+" is not an armstrong number");
			
	}

}
}
