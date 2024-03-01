package Assignment_6;

import java.util.Scanner;

public class ValidateEmailAddress {
	public static boolean isValidEmail(String str) {
		int AT_Count=0,AT_Index=str.indexOf("@");
		int domainIndex=0;
		String[] domainNames= {".org",".in",".com"};
		for(int i=0;i<str.length();i++) {
			if("@".equals(str.substring(i,i+1))) {
				AT_Count++;
			}
		}
		for(int i=0;i<domainNames.length;i++) {
			if(str.endsWith(domainNames[i])) {
				domainIndex=str.lastIndexOf(domainNames[i]);
			}
		}
		if(AT_Index>0 && AT_Index+1<domainIndex && domainIndex!=0 && AT_Count==1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter email address");
		 String email=s.nextLine();
		 if(isValidEmail(email)) {
			 System.out.println("\n"+email+" is vaild");
		 }
		 else {
			 System.out.println("\n"+email+" is not vaild");
		 }
		 s.close();
	}
}
