import java.util.Scanner;

public class SecretLanguageEncoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message to encode: ");
        String message = scanner.nextLine();

        String encodedMessage = encodeMessage(message);

        System.out.println("Encoded message: " + encodedMessage);
    }

    public static String encodeMessage(String message) {
        // Create a StringBuilder to build the reversed message
        StringBuilder reversedMessage = new StringBuilder();

        // Iterate through the message characters in reverse order
        for (int i = message.length() - 1; i >= 0; i--) {
            reversedMessage.append(message.charAt(i));
        }

        // Convert the StringBuilder to a String and return the reversed message
        return reversedMessage.toString();
    }
}