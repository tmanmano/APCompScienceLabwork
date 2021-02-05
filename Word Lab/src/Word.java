//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   	int numVowels;
   	int length;
   	String word;
   	//why is it static?
   
   //add an instance variable

	//create a constructor
	
	//create other methods
	//look at the sample runner code
	//on the lab handout

	//create a toString method
   
   public Word (String word){
	   this.word = word;
	   
   }

public int getNumVowels() {
	numVowels = 0;
	
	for(int i = 0; i < vowels.length(); i++) {
		
	char vC = vowels.charAt(i);
		
		for(int j = 0; j < word.length(); j++) {
			if(vC == word.charAt(j)) {
				numVowels = numVowels + 1;
			}
		}
	}
	
	return numVowels;
}

public int getLength() {
	
	length = word.length();
	return length;
}

public void setWord(String w) {
   word = w;
	
}
public String toString() {
	return word;
}
}