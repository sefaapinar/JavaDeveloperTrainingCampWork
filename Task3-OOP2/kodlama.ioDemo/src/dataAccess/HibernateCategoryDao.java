package dataAccess;

import entities.Category;

import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void Add(Category category) {
        System.out.println("Kurs Kategorisi: " + category.getCategoryName() + "Hibernate Teknolojisi ile kaydedildi!");
    }

    @Override
    public void Delete(Category category) {
        System.out.println("Kurs Kategorisi: " + category.getCategoryID() + "Hibernate Teknolojisi ile silindi!");
    }

    @Override
    public void Update(Category category) {
        System.out.println("Kurs Kategorisi: " + category.getCategoryName() + "Hibernate Teknolojisi ile güncellendi!");
    }

    @Override
    public List<Category> getAllCategories(List<Category> categories) {
        return categories;
    }
}
