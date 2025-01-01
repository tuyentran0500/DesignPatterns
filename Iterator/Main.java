package Iterator;

public class Main {
    public static void main(String[] args) {
        // Create a collection
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook("The Hobbit");
        bookCollection.addBook("1984");
        bookCollection.addBook("Brave New World");

        // Get an iterator
        Iterator<String> iterator = bookCollection.createIterator();

        // Traverse the collection using the iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
