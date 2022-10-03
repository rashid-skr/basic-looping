package looping;

import java.util.Scanner;

public class statement {

public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	
	int num;
	System.out.print("any enteger=");
	
     num=input.nextInt();
	
	if(num>4) {
	System.out.print("Positive");
	}
	else if(num<0) {
		System.out.print("negative");
		}
	else {
		System.out.print("other zero");
	}
}

}
