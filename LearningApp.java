import java.util.Scanner;

public class LearningApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LearningContent content = new LearningContent();

        while (true) {
            System.out.println("1. Add learning content");
            System.out.println("2. Show learning content");
            System.out.println("3. Delete learning content");
            System.out.println("4. Search learning content");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 1) {
                System.out.print("Enter the content: ");
                String newContent = scanner.nextLine();
                content.addContent(newContent);
            } else if (choice == 2) {
                content.showContent();
            } else if (choice == 3) {
                System.out.print("Enter the index of the content to delete: ");
                int index = scanner.nextInt() - 1;
                content.deleteContent(index);
            } else if (choice == 4) {
                System.out.print("Enter the keyword to search: ");
                String keyword = scanner.nextLine();
                content.searchContent(keyword);
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
