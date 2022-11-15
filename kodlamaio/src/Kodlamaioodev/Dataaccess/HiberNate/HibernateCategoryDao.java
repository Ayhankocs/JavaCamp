package Kodlamaioodev.Dataaccess.HiberNate;




import java.util.ArrayList;
import java.util.List;
import Kodlamaioodev.Dataaccess.CategoryDao;
import Kodlamaioodev.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

    List<Category> categories;

    public HibernateCategoryDao() {
        categories=new ArrayList<Category>();
    }

    @Override
    public void add(CategoryDao categoryDao) {

    }

    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("Kategori bilgileri hibernate ile veritaban�na eklendi");
    }
    @Override
    public List<Category> getAll() {
        return categories;
    }
}
