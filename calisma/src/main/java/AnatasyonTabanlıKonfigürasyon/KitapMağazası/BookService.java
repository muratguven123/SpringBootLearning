package AnatasyonTabanlıKonfigürasyon.KitapMağazası;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private final List<String> books = new ArrayList<>();

    public void addBook(String title){
        books.add(title);
        System.out.println("Book added: "+title);
    }
    public List<String> listBooks(){
        return books;
    }
}
