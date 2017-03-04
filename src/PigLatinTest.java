import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PigLatinTest {

	//Tests the basic rules
	
	@Test
	public void evaluatesExpression1() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("pig");
		assertEquals("igpay", translatedWord);
	}
	@Test
	public void evaluatesExpression2() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("banana");
		assertEquals("ananabay", translatedWord);
	}

	// Tests when words begin with consonant clusters

	@Test
	public void evaluatesExpression3() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("cheers");
		assertEquals("eerschay", translatedWord);
	}
	@Test
	public void evaluatesExpression4() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("shesh");
		assertEquals("eshay", translatedWord);
	}
	@Test
	public void evaluatesExpression5() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("smile");
		assertEquals("ilesmay", translatedWord);
	}

	// Tests when the word begins with a vowel

	@Test
	public void evaluatesExpression6() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("eat");
		assertEquals("eatway", translatedWord);
	}
	@Test
	public void evaluatesExpression7() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("omelet");
		assertEquals("omeletway", translatedWord);
	}
	@Test
	public void evaluatesExpression8() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("egg");
		assertEquals("eggway", translatedWord);
	}
	@Test
	public void evaluatesExpression9() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("are");
		assertEquals("areway", translatedWord);
	}
}