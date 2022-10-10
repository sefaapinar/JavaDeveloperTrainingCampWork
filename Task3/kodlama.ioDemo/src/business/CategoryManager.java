package business;

import dataAccess.CategoryDao;
import entities.Category;

import javax.swing.plaf.synth.ColorType;

public class CategoryManager {
    private Category[] categories;
    private CategoryDao _categoryDao;

     public CategoryManager(CategoryDao _categoryDao, Category[] categories){
         this._categoryDao = _categoryDao;
         this.categories = categories;
     }

     public void Add(Category category) throws Exception{
         for(Category category1 : categories){
             if(category.getCategoryName() == category1.getCategoryName()){
                 throw new Exception("Kurs ismi zaten var!");
             }
         }
         _categoryDao.Add(category);
     }

}
