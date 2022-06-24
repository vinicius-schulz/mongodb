package com.example.mdbspringboot.config.dbmigrations;

import com.example.mdbspringboot.model.GroceryItem;
import com.example.mdbspringboot.repository.ItemRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import java.util.UUID;

/**
 * Creates the initial database setup.
 */
@ChangeLog(order = "001")
public class DatabaseInitChangeLog {

  @ChangeSet(order = "001", id = "init_grocery01", author = "vinicius")
  public void initDepartments(ItemRepository groceryItemRepo) {
    groceryItemRepo.save(
      new GroceryItem(UUID.randomUUID(), "Whole Wheat Biscuit", 5, "snacks")
    );
    groceryItemRepo.save(
      new GroceryItem(
        UUID.randomUUID(),
        "XYZ Kodo Millet healthy",
        2,
        "millets"
      )
    );
  }

  @ChangeSet(order = "002", id = "init_grocery02", author = "vinicius")
  public void initDepartmentsMore(ItemRepository groceryItemRepo) {
    groceryItemRepo.save(
      new GroceryItem(UUID.randomUUID(), "Dried Whole Red Chilli", 2, "spices")
    );
    groceryItemRepo.save(
      new GroceryItem(UUID.randomUUID(), "Healthy Pearl Millet", 1, "millets")
    );
    groceryItemRepo.save(
      new GroceryItem(
        UUID.randomUUID(),
        "Bonny Cheese Crackers Plain",
        6,
        "snacks"
      )
    );
  }
}
