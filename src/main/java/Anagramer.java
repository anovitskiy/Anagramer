import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Anagramer {
	public static void main(String[] args) {
		CustomHashSet words = new CustomHashSet(1000, 0.75);
		String inputFilePath = args[0];

		try {
			BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
			try {
				String line = br.readLine();
				
				while (line != null) {
					if (!line.isEmpty()) {
						// CustomHashSet.add() only returns true when
						// the added node was not previously present
						boolean newCanonicalWord = words.add(new CanonicalWord(line));
						
						if (newCanonicalWord) {
							System.out.println("FALSE");
						} else {
							System.out.println("TRUE");
						}
					}
					line = br.readLine();
				}
			} finally {
				br.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
