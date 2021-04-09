    public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
                                "|\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|    +\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|    +-\n"+
                                "|\n"+
                                "/\\\n",


                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|\n"+
                                "/\\\n",


                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \n"+
                                "/\\\n",


                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \\\n"+
                                "/\\\n",
                            };
    
    public HangingMan(){
        numWrongGuesses = 0;
    }
    
    public void show(){
        if(numWrongGuesses < 7) System.out.println(HangmanImage[numWrongGuesses]);
    }
    
    public boolean isntDead(){
        return numWrongGuesses < 7;
    }
    
    public void dieSomeMore(){
        numWrongGuesses++;
    }
}
