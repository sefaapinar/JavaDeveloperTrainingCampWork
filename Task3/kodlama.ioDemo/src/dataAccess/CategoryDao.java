package dataAccess;

import entities.Category;

import java.util.List;

public interface CategoryDao {
    void Add(Category category);
    void Delete(Category category);
    void Update(Category category);
    List<Category> getAllCategories(List<Category> categories);
}
