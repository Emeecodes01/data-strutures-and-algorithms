package hashtable;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        var string = "a green apple";

        CharacterChecker characterChecker = new CharacterChecker();
        characterChecker.getFirstNonRepeatingCharacter(string);
        characterChecker.getFirstRepeatingCharacter(string);

    }

}
