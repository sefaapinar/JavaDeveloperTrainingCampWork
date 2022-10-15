package dataAccess;

import entities.Category;

import java.util.List;

public class JDBCCategoryDao implements CategoryDao{
    @Override
    public void Add(Category category) {
        System.out.println("Categori: " + category.getCategoryName() + "JDBC Teknolojisi ile eklendi!");
    }

    @Override
    public void Delete(Category category) {
        System.out.println("Categori: " + category.getCategoryID() + "JDBC Teknolojisi ile silindi!");
    }

    @Override
    public void Update(Category category) {
        System.out.println("Kategori: " + category.getCategoryName() + "JDBC teknolojisi ile güncellendi!");
    }

    @Override
    public List<Category> getAllCategories(List<Category> categories) {
        return categories;
    }
}
