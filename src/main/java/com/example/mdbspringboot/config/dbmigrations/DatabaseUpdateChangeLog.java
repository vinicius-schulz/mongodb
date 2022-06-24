package com.example.mdbspringboot.config.dbmigrations;

import com.example.mdbspringboot.model.GroceryItem;
import com.example.mdbspringboot.repository.ItemRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import java.util.UUID;

/**
 * Update collection.
 */
@ChangeLog(order = "002")
public class DatabaseUpdateChangeLog {

  @ChangeSet(order = "001", id = "init_grocery03", author = "vinicius")
  public void initDepartments(ItemRepository groceryItemRepo) {
    groceryItemRepo.save(
      new GroceryItem(UUID.randomUUID(), "TESTE TESTE", 5, "snacks")
    );
    groceryItemRepo.save(
      new GroceryItem(
        UUID.randomUUID(),
        "Testando",
        2,
        "millets"
      )
    );
  }
}
