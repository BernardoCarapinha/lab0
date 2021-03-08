public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOftries;
    private InputReader reader;
    public WordGuessingGame()
    {
        hiddenWord = "abc";
        guessedWord = "___";

    }

    public String hiddenWord()
    {
        return hiddenWord;
    }
    
    public String guessedWord()
    {
        return guessedWord;
    }
    
    public int numberOftries()
    {
        return numberOftries;
    }
    
    public void showGuessedWord()
    {
        System.out.println(guessedWord);
        
    }
}
