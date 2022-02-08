package email;

import java.util.ArrayList;
import java.util.Scanner;

public class emailid {
		
		public static void main(String[] args) {
			ArrayList <String> list =new ArrayList <String>();
			list.add("bhargavreddy1211@gmail.com");
			list.add("ram1234@gmail.com");
			list.add("vikram@gmail.com");
			list.add("naveen@gmail.com");
			list.add("mithin23@gmail.com");
			System.out.println(list);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the EmailId");
			String input = sc.next();
			boolean flag = false;
			for (String s: list) {
				flag = input.equals(s);
				if(flag == true) {
					System.out.println("Valid");
				break;
				}
			} if(flag == false)
				System.out.println("InValid");
			
			    
		

		}
	}