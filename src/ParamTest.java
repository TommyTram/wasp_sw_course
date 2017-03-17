import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamTest{
	//Test basic space separator

	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "guys",  "uysgay" },
                { "this",  "isthay" },
                { "is",  "isway" },
                { "how",  "owhay" },
                { "you",  "ouyay" },
                { "should",  "ouldshay" },
                { "do tests",  "oday eststay" }
           });
    }

    @Parameter // first data value (0) is default
    public String fInput;

    @Parameter(1)
    public String fExpected;

    @Test
    public void testWords() {

        assertEquals( fExpected, PigLatin.multipleWordTranslator(fInput) );

    }








	
	/*@Test
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
*/

	
}



