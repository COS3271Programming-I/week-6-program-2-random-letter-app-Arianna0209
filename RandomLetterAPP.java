package week6;

public class RandomLetterAPP {
	
	// This program generates a random word and then changes out one letter from it nineteen times.
	
	public static void main(String[] args) throws InterruptedException {
	
		// Tell the user what the program does:
		System.out.println("This program generates a random word and then changes out one letter from it nineteen times");
		
		// Create the StringBuilder:
		StringBuilder word = new StringBuilder("");
		
		// Append a random letter to the "word" string ten times to create the random word.
		int n;
		for (n = 1; n <= 10; n += 1) {
			int randomLetter = (int)(Math.random()*26 + 97);
			word.append((char)(randomLetter));
		}
		
		// Tell the user the initial word:
		System.out.println("\nThe initial word is " + word);
		
		// Change out a letter in the word nineteen times:
		for (n = 1; n <= 19; n += 1) {
			// Get a random index number for the letter to replace:
			int randomPosition = (int)(Math.random()*10);
			
			// Get a random letter to replace the old letter with:
			int randomLetter = (int)(Math.random()*26 + 97);
			
			// Declare a new string:
			StringBuilder changedString = new StringBuilder("");
			
			// Replace the value:
			if (randomPosition != 0) {
				// Cut the word into two halves excluding the chosen letter:
				String wordHalf1 = word.substring(0, (randomPosition));
				String wordHalf2 = word.substring((randomPosition + 1), 10);
				
				// Append the first half to the new string, then the new letter, then the second half:
				changedString.append(wordHalf1);
				changedString.append((char)randomLetter);
				changedString.append(wordHalf2);
				
			}
			else {
				// If the chosen letter is the first index then take the chosen letter out by creating a substring:
				String wordEnd = word.substring(1, 10);
				
				// Create a new string beginning with the changed letter:
				changedString.append((char)randomLetter);
				
				// Append the rest of the word:
				changedString.append(wordEnd);
			}
	
			// Update the word string:
			word = changedString;
			
			// Print the new word after waiting a few seconds:
			Thread.sleep(2000);
			System.out.format("\nChange #%d: %s", n, changedString);
		}
		
		// Tell the user the program is ending:
		Thread.sleep(1000);
		System.out.println("\n\nProgram ended.");
	
	}
}


