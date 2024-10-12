package AnatasyonTabanlıKonfigürasyon.KitapMağazası;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InventoryRepository {
private final Map<String,Integer> inventory = new HashMap<>();

public void addInventory(String title,int quantatity){
    inventory.put(title,quantatity);
    System.out.println("Inventory updated for book: "+title+ "quantatity");
}
public Integer getInventory(String title){
    return inventory.getOrDefault(title,0);
}

}
