
package com.example.BadImageBoys.Repositories;

import com.example.BadImageBoys.Models.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends GenericRepository<Item, Long>
{}