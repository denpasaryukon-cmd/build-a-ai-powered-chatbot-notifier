import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class d1xp_build_a_ai_powe {

    // AI Model
    private static List<String> aiResponses = new ArrayList<>();

    // Chatbot Notifier
    private static class Notifier {
        public void notifyUser(String message) {
            System.out.println("Notification: " + message);
        }
    }

    // Main Function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize AI Model
        aiResponses.add("Hello! How can I assist you today?");
        aiResponses.add("I'm not sure I understand. Can you rephrase that?");
        aiResponses.add("That's a great question! Let me look into it for you.");

        Notifier notifier = new Notifier();

        while (true) {
            System.out.print("User: ");
            String userInput = scanner.nextLine();

            // Process User Input
            String aiResponse = processUserInput(userInput);
            notifier.notifyUser(aiResponse);
        }
    }

    // Process User Input
    private static String processUserInput(String userInput) {
        // Implement AI Logic Here
        // For now, just return a random response
        int randomIndex = (int) (Math.random() * aiResponses.size());
        return aiResponses.get(randomIndex);
    }
}