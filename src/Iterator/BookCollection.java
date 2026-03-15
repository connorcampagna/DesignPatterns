package Iterator;

// 3. The Concrete Collection (Storing the data)
public class BookCollection implements MyCollection {
    private String[] books = {"Design Patterns", "Clean Code", "Refactoring"};

    public MyIterator createIterator() {
        return new BookIterator(this.books);
    }
}