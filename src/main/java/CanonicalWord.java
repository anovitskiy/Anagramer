import java.util.Arrays;

public class CanonicalWord {
	private int[] charCounts = new int[26];
	private int wordLength = 0;
	
	/**
	 * Constructor counts the number of occurrences 
	 * of each character in the input string
	 * @param input a String
	 */
	CanonicalWord(String input){
		char[] word = input.toLowerCase().toCharArray();
		for(char chr : word){
			charCounts[chr - 'a']++;
			wordLength++;
		}
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(charCounts);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CanonicalWord other = (CanonicalWord) obj;
		if (this.wordLength != other.wordLength)
			return false;
		if (!Arrays.equals(this.charCounts, other.charCounts))
			return false;
		return true;
	}
}
