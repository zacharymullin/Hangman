
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    ArrayList<String> words = new ArrayList<String>();
    int index;
    String word;
    ArrayList<String> guessed = new ArrayList<String>();
    ArrayList<Character> letters = new ArrayList<Character>();

    public Puzzle(){
        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                    String tempWord = scanner.nextLine();
					if(!Character.isUpperCase(tempWord.charAt(0))) words.add(tempWord.toUpperCase());
            }
            scanner.close();
            index = (int) (Math.random() * (double) words.size());
			System.out.println(words.size());
            word = words.get(index);
            for(int i = 0; i < word.length(); i++){
                letters.add('_');
            }

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public boolean makeGuess(String guess){
        if(!guessed.contains(guess)){
            guessed.add(guess);
            if(word.contains(guess)){
				for(int i = 0; i < word.length(); i++){
					if(word.substring(i,i+1).equals(guess)) letters.set(i, word.charAt(i));
				}
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public boolean isUnsolved(){
        for(int i = 0; i < word.length(); i++){
            if(!letters.contains(word.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public void show(){
        System.out.print("Puzzle: ");
        for(int i = 0; i < letters.size(); i++){
            System.out.print(letters.get(i) + " ");
        }
        System.out.println("");
        System.out.print("Guesses: ");
        for(int i = 0; i < guessed.size(); i++){
            System.out.print(guessed.get(i) + " ");
        }
    }

    public String getWord(){
        return word;
    }
}
