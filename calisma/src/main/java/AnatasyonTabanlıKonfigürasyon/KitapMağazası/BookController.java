package AnatasyonTabanlıKonfigürasyon.KitapMağazası;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.awt.print.Book;

@Controller
public class BookController {

    private final BookService bookService;
    private final InventoryRepository inventoryRepository;


    @Autowired
    public BookController(BookService bookService,InventoryRepository inventoryRepository){
        this.bookService = bookService;
        this.inventoryRepository = inventoryRepository;
    }
    public void addNewBook(String title,int quantity){
        bookService.addBook(title);
        inventoryRepository.addInventory(title,quantity);
    }
    public void displayInventory(String title){
        int quantity = inventoryRepository.getInventory(title);
        System.out.println("Book: "+title+", Inventory: "+quantity);
    }
}
