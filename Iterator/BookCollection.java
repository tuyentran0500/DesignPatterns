package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BookCollection {
    private List<String> books = new ArrayList<>();
    public void addBook(String book){
        books.add(book);
    }
    public Iterator<String> createIterator(){
        return new BookIterator();
    }

    private class BookIterator implements Iterator<String> {
        private int currentIndex = 0;
        
        @Override
        public boolean hasNext() {
            return currentIndex < books.size();
        }
        @Override
        public String next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            return books.get(currentIndex++);
        }
    }
}

