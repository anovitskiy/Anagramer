import static org.junit.Assert.*;
import org.junit.Test;


public class CanonicalWordTest {
	@Test
	public void shortAnagram() {
		CanonicalWord word1 = new CanonicalWord("sed");
		CanonicalWord word2 = new CanonicalWord("eds");
		
		assertTrue(word1.equals(word2));
	}
	
	@Test
	public void longAnagram() {
		CanonicalWord word1 = new CanonicalWord("supercalifragilisticexpialidocious");
		CanonicalWord word2 = new CanonicalWord("supercaliflagiristicexpialidocious");
		
		assertTrue(word1.equals(word2));
	}
	
	@Test
	public void differentLengthWords() {
		CanonicalWord word1 = new CanonicalWord("short");
		CanonicalWord word2 = new CanonicalWord("longer");
		
		assertFalse(word1.equals(word2));
	}
	
	@Test
	public void caseInsensitive() {
		CanonicalWord word1 = new CanonicalWord("ABC");
		CanonicalWord word2 = new CanonicalWord("bac");
		
		assertTrue(word1.equals(word2));
	}
	
	@Test
	public void emptyWordAcceptable() {
		CanonicalWord word1 = new CanonicalWord("something");
		CanonicalWord word2 = new CanonicalWord("");
		
		assertFalse(word1.equals(word2));
	}
	
	@Test
	public void sameHashCodeForAnagrams() {
		CanonicalWord word1 = new CanonicalWord("sed");
		CanonicalWord word2 = new CanonicalWord("eds");
		
		assertTrue(word1.hashCode() == word2.hashCode());
	}
	
	@Test
	public void differentHashCodesForDifferentCanonicalWords() {
		CanonicalWord word1 = new CanonicalWord("not");
		CanonicalWord word2 = new CanonicalWord("cool");
		
		assertTrue(word1.hashCode() != word2.hashCode());
	}
	
}
