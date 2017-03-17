import java.lang.Math;
import java.lang.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.*;


// Class declaration
public class PigLatin {



	// Method for translating an entire string with words to piglatin
	public static String multipleWordTranslator(String sentence) {

		// Separate sentence into words
		String[] words = sentence.split("(?=[,.!?])|\\s+");

		// The string array holding the translated words
		String[] translatedWords = new String[words.length];
		
		// Translate each separated word
		for (int i = 0; i < translatedWords.length; i++) {
			// If it's a , . ! ? don't translate
			if (",.!?".indexOf(words[i]) != -1) {
				translatedWords[i] = words[i];
			// If it's not then translate
			} else {
				translatedWords[i] = translator(words[i]);	
			}
		}

		// Variable for the translated sentence
		String translatedSentence = translatedWords[0];

		// Rebuild the translated sentence
		for (int i = 1; i < translatedWords.length; i++) {
			// If it's a , . ! ? no space before
			if (",.!?".indexOf(words[i]) != -1) {
				translatedSentence += words[i];
			// Else add space
			} else {
				translatedSentence += " " + translator(words[i]);	
			}
		}

		return translatedSentence;
	}

	// Method for translating single worlds to piglatin
	public static String translator(String word) {

		// Index holder for the first vowel
		int firstVowelIndex = 0;

        boolean hasUpperCase = false;

		// Loop through to find the first vowel
		for (int i = 0; i < word.length(); i++) {
			// Extract letter
			char letter = word.charAt(i);

            if (Character.isUpperCase(word.charAt(0))){
                hasUpperCase = true;
                word = word.toLowerCase();
            }

			// Vowel check
			if ("AEIOUaeiou".indexOf(letter) != -1) {
				firstVowelIndex = i;
				break;
			}
		}

		// Re-arrange the word and apply 'ay' at the end
		String firstWord = word.substring(firstVowelIndex, word.length());
		String secondWord = word.substring(0, firstVowelIndex);

		// If index = 0 then the first word is a vowel
		String lastWord;
		if (firstVowelIndex == 0) {
			lastWord = "way";
		} else {
			lastWord = "ay";
		}

		// Check consonant cluster in the case of e.g shesh -> eshay and not eshshay
		int firstWordLength = firstWord.length();
		int secondWordLength = secondWord.length();
		String firstWordEnd = firstWord.substring(Math.max(firstWordLength-2, 0), firstWordLength);
		String secondWordStart = secondWord.substring(0, secondWordLength);

		if (firstWordEnd.equals(secondWordStart)) {
			firstWord = word.substring(firstVowelIndex, word.length() - 2);
		}

        if (hasUpperCase == true) {
            //firstWord.charAt(0).toUpperCase();
            firstWord = firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1);
        }

		// Append the strings
		String piglatinWord = firstWord + secondWord + lastWord;
	
		// Return the translated word
		return piglatinWord;
	}

	public static String reverseTranslator(String pigLatinWord) {

		String cutWord = pigLatinWord.substring(0, pigLatinWord.length() - 2);


		String word = cutWord.charAt(cutWord.length() - 1) + cutWord.substring(0,cutWord.length() - 1);
		System.out.println(word);
		return word;
	}

	public static String readFile(String path, Charset encoding) throws IOException {
		// Reads a text file and returns a string with its content.
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static void main(String args[]) {

		ConsoleUI consoleUI = new ConsoleUI();
		consoleUI.processArgs( args );

		if (consoleUI.authors_flag){
			consoleUI.printAuthorsInfo();
			return;
		}
		if (consoleUI.help_flag){
			consoleUI.printHelpInfo();
			return;
		}

		// If an input is given
		if (args.length > 0) {

			// Store word
			String word	= args[0];
			// Translate word

			String piglatinWord = translator(word);
			// Print word
			System.out.println(piglatinWord);
		}
	
	}
}
