public class Task4_B_1_2 {
    public static void main(String[] args) {
        String encryptedText = "";
        String decryptedText = "";
        String text = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKMLNOPQRSTUVWXYZ";
        for (int i = 0; i < text.length(); i++) {
            encryptedText += encryptCharacter(text.charAt(i), 150);
        }
        System.out.println(encryptedText);

        for (int i = 0; i < encryptedText.length(); i++) {
            decryptedText += decryptCharacter(encryptedText.charAt(i), 150);
        }
        System.out.println(decryptedText);
    }

    public static char encryptCharacter(char c, int offset) {
        if (isLowerCase(c)) {
            return (char) ((((c + offset) - 97) % 26) + 97);
        } else if (isUpperCase(c)) {
            return (char) ((((c + offset) - 65) % 26) + 65);
        } else {
            return c;
        }
    }

    public static char decryptCharacter(char c, int offset) {
        int offsetCharLower = c - offset - 97;
        int offsetCharUpper = c - offset - 65;
        while (offsetCharLower < 0) {
            offsetCharLower += 26;
        }
        while (offsetCharUpper < 0) {
            offsetCharUpper += 26;
        }
        if (isLowerCase(c)) {
            return (char) ((offsetCharLower % 26) + 97);
        } else if (isUpperCase(c)) {
            return (char) ((offsetCharUpper % 26) + 65);
        } else {
            return c;
        }

    }

    public static boolean isLetter(char c) {
        return (int) c >= 65 && (int) c <= 90 || (int) c >= 97 && (int) c <= 122;
    }

    public static boolean isLowerCase(char c) {
        return (int) c >= 97 && (int) c <= 122;
    }

    public static boolean isUpperCase(char c) {
        return (int) c >= 65 && (int) c <= 90;
    }
}