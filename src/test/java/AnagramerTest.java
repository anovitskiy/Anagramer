import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnagramerTest {


	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStream() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStream() {
	    System.setOut(null);
	}

	@Test
	public void testMain() {
		Anagramer.main(new String[] {"src/test/java/input/words.txt"});
		assertEquals("FALSE\nFALSE\nFALSE\nFALSE\nFALSE\nFALSE\nTRUE\nFALSE\nFALSE\nTRUE\nFALSE\nTRUE\nFALSE\n",outContent.toString());
	}
}
