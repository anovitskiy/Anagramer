import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CustomHashSetTest {
	CustomHashSet stuff;
	
	@Before
	public void setup() {
		stuff = new CustomHashSet(1000, 0.75);
	}

	@Test
	public void addFirstItem() {
		boolean isNewWord = stuff.add("hello");
		assertTrue(isNewWord);
	}
	
	@Test
	public void attemptAddingDuplicateItem() {
		stuff.add("hello");
		boolean isNewWord = stuff.add("hello");
		assertFalse(isNewWord);
	}
	
	@Test(timeout=2000)
	public void addLotsOfUniqueWords() {
		for(int i = 0; i < 1000000; i++){
			RandomString rs = new RandomString(i%100+1);
			stuff.add(new CanonicalWord(rs.nextString()));
		}
	}
}
