public class CodeupCrypt {
    public static double version;

    public static String password(String input) {
//        return ""; //will fail the test on purpose, we will add/edit the code to get it to pass
//        return "f3r"; //can't cheat to just give you what you want, make a valid method
        String hash = "";
        for (char character : input.toCharArray()) {
            switch (character) {
                case 'a':
                case 'A':
                    hash += 4;
                    break;
                case 'e':
                case 'E':
                    hash += 3;
                    break;
                case 'i':
                case 'I':
                    hash += 1;
                    break;
                case 'o':
                case 'O':
                    hash += 0;
                    break;
                case 'u':
                case 'U':
                    hash += 9;
                    break;
                default:
                    hash += character;
            }
        }
        return hash;
    }

    public static boolean checkPassword(String pass, String hash){
//        return false;
        return hash.equals(password(pass));
    }
}
