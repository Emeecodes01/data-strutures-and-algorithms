package hashtable;

public class HashFunction {

    public static void main(String[] args) {
        System.out.println(hash(124533245));
        System.out.println(hashString("iloveyou"));
    }

    public static int hash(int num) {
        return num % 100;
    }

    public static int hashString(String hash) {
        int hashCode = 0;
        for (char ch: hash.toCharArray()) {
            hashCode += ch;
        }
        return hashCode % 100;
    }
}
