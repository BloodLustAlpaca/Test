package monoAlphabet;



public class Cipher {
	char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	 String result = new String(alphabet);
	 char[] endAlpha = new char[26];
	 String keyword;
	 int idx = 0;

	 //Constructor Sets keyword to whatever I pass
	 public Cipher(String keyword){
		 this.keyword = keyword;
		 
	 }
	 //Constructor If no keyword sets to a to just print out alphabet
	 public Cipher(){
		 keyword = "a";
	 }
	public String makeCipher(){
		System.out.println(result);
		System.out.println(keyword + " is the keyword");
		
		/*This for loop takes the key word and adds one letter at a time to the beginning of the final array result*/
		for (int i = 0; i< keyword.length(); i++ ){
			endAlpha[idx++] = keyword.charAt(i);
		}
		
		/*This for loop takes each letter of the alphabet and puts it in the final array starting after the keyword, if it finds it in the keyword it skips that letter*/
		for (int i = 0; i< alphabet.length; i++){
			
			if (keyContains(alphabet[i]) == false){
				endAlpha[idx] = alphabet[i];
				idx++;
			};
			
		}
		System.out.println(endAlpha);
		String returnString = new String(endAlpha);
		return returnString;
	}
	//Checks the keyword for a particular alphabet letter, if in the keyword it returns true. 
	private boolean keyContains(char c){
		boolean contains = false;
		for (int i = 0; i<keyword.length(); i++){
			if (keyword.charAt(i) == c){
				contains = true;
			}
		}
		return contains;
		
	}
	
	
	

}
