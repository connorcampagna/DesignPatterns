package Composite;

// 3. The Composite (A grouping object that holds children)
import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) { this.name = name; }

    public void add(FileSystemItem item) { children.add(item); }

    public void printName() {
        System.out.println("Folder: " + name);
        // It recursively calls the same method on all its children!
        for (FileSystemItem item : children) {
            item.printName();
        }
    }
}