import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PigLatinTest {

	//Tests the basic rules
	
	@Test
	public void evaluatesExpression1() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("pig");
		assertEquals("igpay", translatedWord);
	}
	@Test
	public void evaluatesExpression2() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("banana");
		assertEquals("ananabay", translatedWord);
	}

	// Tests when words begin with consonant clusters
	
	@Test
	public void evaluatesExpression3() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("cheers");
		assertEquals("eerschay", translatedWord);
	}
	@Test
	public void evaluatesExpression4() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("shesh");
		assertEquals("eshay", translatedWord);
	}
	@Test
	public void evaluatesExpression5() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("smile");
		assertEquals("ilesmay", translatedWord);
	}

	// Tests when the word begins with a vowel

	@Test
	public void evaluatesExpression6() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("eat");
		assertEquals("eatway", translatedWord);
	}
	@Test
	public void evaluatesExpression7() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("omelet");
		assertEquals("omeletway", translatedWord);
	}
	@Test
	public void evaluatesExpression8() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("egg");
		assertEquals("eggway", translatedWord);
	}
	@Test
	public void evaluatesExpression9() {
		PigLatin piglatin = new PigLatin();
		String translatedWord = piglatin.translator("are");
		assertEquals("areway", translatedWord);
	}
}