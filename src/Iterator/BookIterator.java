package Iterator;

// 4. The Concrete Iterator (Handling the loop logic)
public class BookIterator implements MyIterator {
    private String[] books;
    private int position = 0;

    public BookIterator(String[] books) {
        this.books = books;
    }

    public boolean hasNext() {
        return position < books.length;
    }

    public Object next() {
        if (this.hasNext()) {
            return books[position++]; // Return item, then increment position
        }
        return null;
    }
}