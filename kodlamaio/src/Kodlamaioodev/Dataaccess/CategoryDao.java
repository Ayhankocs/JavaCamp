package Kodlamaioodev.Dataaccess;

import java.util.List;
import Kodlamaioodev.entities.Category;


public interface CategoryDao {
    void add(CategoryDao categoryDao);

    void add(Category category);

    List<Category> getAll();
}
