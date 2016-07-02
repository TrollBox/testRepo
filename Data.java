import java.util.*;

public class Data
{
	private int wordLength;
	private List<String> words;
	
	public Data(int wordLength) {
		this.wordLength = wordLength;
		this.words = new ArrayList<String>();
	}
	
	public int getWordLength() {
		return wordLength;
	}
	
	public void addWord(String word) {
		words.add(word);
	}
	
	public void print() {
		String output = wordLength + ": ";
		
		for (String word: words) {
			output += word + " ";
		}
		
		System.out.println(output);
	}
}