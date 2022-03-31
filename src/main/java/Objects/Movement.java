package Objects;

import java.util.Locale;
import java.util.Scanner;


public class Movement {

    public static class StringLengthException extends Exception {
        public StringLengthException(String error) {
            super(error);
        }
    }

   static Scanner ui = new Scanner(System.in);

    public static String MoveCharacter()
    {
        try
        {
            String move = ui.nextLine().toLowerCase(Locale.ROOT);

            if(move.length() > 1) throw new StringLengthException("To many characters entered here");
            if(move.length() == 0) throw new StringLengthException("Enter something please!");
            return move;
        }
         catch (StringLengthException e) {
            e.printStackTrace();
        }
        return MoveCharacter();
    }
    public static int [] Direction(int [] Pos, String input)
    {
        int [] stuff = new int[2];
        switch (input) {
            case "w":
                if (Pos[0] == 1) {
                    System.out.println("We tried to go outside of the border!");
                    return Pos;
                }
                stuff[0] = Pos[0] - 1;
                stuff[1] = Pos[1];
                break;
            case "a":
                if (Pos[1] == 1) {
                    System.out.println("We tried to go outside the border!");
                    return Pos;
                }
                stuff[0] = Pos[0];
                stuff[1] = Pos[1] - 1;
                break;
            case "s":
                if (Pos[0] == 15) {
                    System.out.println("We tried to go outside the border!");
                    return Pos;
                }
                stuff[0] = Pos[0] + 1;
                stuff[1] = Pos[1];
                break;
            case "d":
                if (Pos[1] == 15) {
                    System.out.println("We tried to go outside the border!");
                    return Pos;
                }
                stuff[0] = Pos[0];
                stuff[1] = Pos[1] + 1;
                break;
        }
        return stuff;
    }
}



