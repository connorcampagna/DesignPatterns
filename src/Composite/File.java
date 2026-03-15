package Composite;

// 2. The Leaf (A singular object with no children)
public class File implements FileSystemItem {
    private String name;
    public File(String name) { this.name = name; }

    public void printName() {
        System.out.println("File: " + name);
    }
}