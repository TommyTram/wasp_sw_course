import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.Math;
import java.lang.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.*;

public class PigLatinReadTextTest {
	@Test
	public void evaluatesExpression1() throws IOException {
		String readString = PigLatin.readFile("src/test.txt", StandardCharsets.UTF_8);;
		assertEquals("test", readString);
	}

}