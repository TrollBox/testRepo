/**
Es soll ein Satz über die Konsole eingegeben werden können. 
Das Programm soll alle Wörter ihrer Länge nach in einer Datenstruktur speichern und aufsteigend sortiert ausgeben.

Beispiel:
Eingabe:
> Dies ist ein Beispiel fuer die obige Aufgabe

Ausgabe:
3: ist ein die
4: Dies fuer
5: obige
7: Aufgabe
8: Beispiel

-----------------------------------------------------------------------------------------------------------------

Datenstruktur: Data.java

Bearbeitungszeit: 60 Min
Hilfsmittel: Java API, Java-FX API
**/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Eingabe:");
		
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		String[] words = input.split(" ");
		
		List<Data> datas = new ArrayList<Data>();
		
		for (String word: words) {
			int length = word.length();
			boolean added = false;
			
			for (Data d: datas) {
				if (d.getWordLength() == length) {
					d.addWord(word);
					added = true;
				}
			}
			
			if (!added) {
				for (int i = 0; i < datas.size(); i++) {
					if (datas.get(i).getWordLength() > length) {
						Data newData = new Data(length);
						newData.addWord(word);
						
						datas.add(i, newData);
						added = true;
						break;
					}
				}
				
				if (!added) {
					Data newData = new Data(length);
					newData.addWord(word);
						
					datas.add(newData);
				}
			}
		}
		
		System.out.println("\nAusgabe:");
		
		for (Data d: datas) {
			d.print();
		}
	}
}