// Class declaration
public class PigLatin{


	// Method for translating single worlds to piglatin
	public static String Translator(String word){

		// Index holder for the first vowel
		int firstVowelIndex = 0;

		// Loop through to find the first vowel
		for (int i = 0; i < word.length(); i++){
			// Extract letter
			char letter = word.charAt(i);

			// Vowel check
			if ("AEIOUaeiou".indexOf(letter) != -1) {
				firstVowelIndex = i;
				break;
			}
		}

		// Re-arrange the word and apply 'ay' at the end
		String firstWord = word.substring(firstVowelIndex, word.length());
		String secondWord = word.substring(0, firstVowelIndex);
		String lastWord = "ay";
		String piglatinWord = firstWord + secondWord + lastWord;
		
		// Return the translated word
		return piglatinWord;
	}

	public static void main(String args[]){
	
	String word;
	word = "sup";
	if (args.length > 0) {
		
		word = args[0];
	}
	
	String piglatinWord = Translator(word);
	System.out.println(piglatinWord);
	}
}