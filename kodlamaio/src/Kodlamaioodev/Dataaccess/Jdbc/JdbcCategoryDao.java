package Kodlamaioodev.Dataaccess.Jdbc;



import java.util.ArrayList;
import java.util.List;
import Kodlamaioodev.Dataaccess.CategoryDao;
import Kodlamaioodev.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

    List<Category> categories;

    public JdbcCategoryDao() {
        categories=new ArrayList<Category>();
    }

    @Override
    public void add(CategoryDao categoryDao) {

    }

    @Override
    public void add(Category category) {
        System.out.println("Kategori bilgileri jdbc ile veritaban�na eklendi");
        categories.add(category);
    }

    @Override
    public List<Category> getAll() {
        System.out.println("Kategoriler jdbc ile listelendi.");
        return categories;
    }
}
