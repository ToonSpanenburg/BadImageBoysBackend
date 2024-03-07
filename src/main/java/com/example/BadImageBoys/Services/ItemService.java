package com.example.BadImageBoys.Services;
import com.example.BadImageBoys.Models.Item;
import com.example.BadImageBoys.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService extends GenericService<Item, Long> {

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        super(itemRepository, Item.class);
    }
}