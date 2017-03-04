import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PigLatinTest {
	@Test
	public void evaluatesExpression() {
		PigLatin translator = new PigLatin();
		String translatedWord = translator.Translator("piglatin");
		assertEquals("iglatinpay", translatedWord);
	}
}