import java.util.ArrayList;
import java.util.List;

public class LearningContent {
    private List<String> contents;

    public LearningContent() {
        contents = new ArrayList<>();
    }

    public void addContent(String content) {
        contents.add(content);
    }

    public void showContent() {
        if (contents.isEmpty()) {
            System.out.println("No content available.");
        } else {
            for (int i = 0; i < contents.size(); i++) {
                System.out.println((i + 1) + ". " + contents.get(i));
            }
        }
    }

    public void deleteContent(int index) {
        if (index >= 0 && index < contents.size()) {
            contents.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void searchContent(String keyword) {
        boolean found = false;
        for (String content : contents) {
            if (content.contains(keyword)) {
                System.out.println(content);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No content found with the keyword: " + keyword);
        }
    }
}
