import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PigLatinMultipleWordTest {

	//Test basic space separator
	
	@Test
	public void sentenceWithSpaces() {
		PigLatin piglatin = new PigLatin();
		
		String translatedSentence = piglatin.multipleWordTranslator("hi this is a test");
		assertEquals("ihay isthay isway away esttay", translatedSentence);
	}

	//Test space questionmark and exlamaction mark
	@Test
	public void sentenceWithQuestionMarks() {
		PigLatin piglatin = new PigLatin();
		
		String translatedSentence = piglatin.multipleWordTranslator("question? scared!? does this work?");
		assertEquals("uestionqay? aredscay!? oesday isthay orkway?", translatedSentence);
	}

	// Test dot, comma exclamation and questionmark
	@Test
	public void sentenceWithCommaDotsQuestionExclamation() {
		PigLatin piglatin = new PigLatin();
		
		String translatedSentence = piglatin.multipleWordTranslator("man!? world.,.,. pig!.,?");
		assertEquals("anmay!? orldway.,.,. igpay!.,?", translatedSentence);
	}


	
}