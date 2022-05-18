package package1;



/* WAP reverse string
 * calculate spaces in string
 * first digitIndex
 * find firstdigit
 * find first special characcter
 */
public class AdvanceString {
	 void reverseData(String name) {
		 String str ="";
		 for(int index=name.length()-1;index>=0;index--) {
			 char ch = name.charAt(index);
			 str += ch;
		 }
		 System.out.println(str);
	 }
	 void spaceCalculation(String  name) {
		 char ch = ' ';
		 int count=0;
		 for(int index=0;index<name.length();index++) {
			 char chh = name.charAt(index);
			 if(ch == chh) {
				 count++; 
			 }
		 }
		 System.out.println("Total spaces in "+ name + " is " + count);
	 }
	 void firstDigitIndex(String name) {
		 int digit = -1;
		 for(int index=0;index<name.length();index++) {
			 char ch = name.charAt(index);
			 if(Character.isDigit(ch)) {
				 if(digit ==-1) {
					 digit = index;
					 break;
				 }
			 }
		 }
		 System.out.println("First digit in given string is available at index " + digit);
	 }
	 void firstDigit(String name) {
		 for(int index=0;index<name.length();index++) {
			 char ch = name.charAt(index);
			 if(Character.isDigit(ch)) {
				  	System.out.println("First digit in given string is  " + ch);
					 break;
				 }
			 }
		 
		
	 }
	 public static void main(String[] args) {
		 AdvanceString stringoperation = new AdvanceString();
		 stringoperation.reverseData("Madhuri");
		 stringoperation.spaceCalculation("hi hello GM How are you");
		 stringoperation.firstDigitIndex("MA3dhu2r8i");
		 stringoperation.firstDigit("MA3dhu2r8i");
	}
	

}
