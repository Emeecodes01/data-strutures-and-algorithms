package stringsmanipulationsalgo;

import array.Array;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    /**
     * Strong password is considered to satisfy these conditions
     * Its length is at least 6.
     * It contains at least one digit.
     * It contains at least one lowercase English character.
     * It contains at least one uppercase English character.
     * It contains at least one special character. The special characters are: !@#$%^&*()-+
     * If the password is not correct return the least number of digits to make it a strong password
     */
    public static int isStrongPassword(int n, String password) {

        if (password == null || password.isEmpty()) {
            return 6;
        }

        int errCount = 0;
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()+\\s-])(?=\\S+$).{6,}$");
        Pattern digitsPattern = Pattern.compile("[0-9]");
        Pattern smallLetters = Pattern.compile("[a-z]");
        Pattern capitalLetters = Pattern.compile("[A-Z]");
        Pattern specialChars = Pattern.compile("[!@#$%^&*()+\\s-]");

        Matcher matcher = pattern.matcher(password);

        if (!matcher.matches()) {
            if (!digitsPattern.matcher(password).find())
                errCount++;
            if (!smallLetters.matcher(password).find())
                errCount++;
            if (!capitalLetters.matcher(password).find())
                errCount++;
            if (!specialChars.matcher(password).find())
                errCount++;
        }

        if (errCount < (6 - n)) {
            return 6-n;
        }

        return errCount;
    }
}
