package org.example.Exercises.exo1.service;

import org.example.Exercises.exo1.dao.CommentDao;
import org.example.Exercises.exo1.dao.ImageDao;
import org.example.Exercises.exo1.dao.ProductDao;
import org.example.Exercises.exo1.entity.Comment;
import org.example.Exercises.exo1.entity.Image;
import org.example.Exercises.exo1.entity.Product;
import org.hibernate.Session;

import java.time.LocalDate;
import java.util.List;

public class ProductService {
    private ProductDao productDao;
    private CommentDao commentDao;
    private ImageDao imageDao;

    public ProductService(){
        this.productDao = new ProductDao();
        this.commentDao = new CommentDao();
        this.imageDao = new ImageDao();
    }

    public Product createProduct(Product product){
        return productDao.save(product);
    }
    public void update(Product product){
        productDao.save(product);
    }

    public List<Product> getAllProducts(){
        return productDao.get();
    }

    public Product getProduct(int id){
        return productDao.get(id);
    }

    public void deleteProduct(Product product){
        productDao.delete(product);
    }

    public List<Product> getByPriceMin(double minPrice){
        return productDao.get_by_price_min(minPrice);
    }

    public List<Product> getBetweenDates(LocalDate startDate, LocalDate endDate){
        return productDao.get_between_dates(startDate, endDate);
    }

    public List<Object[]> get_by_below_stock_max(int max){
        return productDao.get_by_below_stock_max(max);
    }

    public List<Object[]> get_stock_by_brand(String brand){
        return productDao.get_stock_by_brand(brand);
    }

    public Double get_price_mean(){
        return productDao.PriceMean();
    }

    public List<Product> get_all_by_brand(String brand){
        return productDao.get_by_brand(brand);
    }

    public void deleteAllByBrand(String brand){
        productDao.delete_by_brand(brand);
    }

    // Services pour les objets Image & Comment

    public Image createImage(Image image){
        return imageDao.save(image);
    }

    public Comment createComment(Comment comment){
        return commentDao.save(comment);
    }

    public List<Product> get_all_product_over_score(double score){
        return productDao.get_products_with_score_over(score);
    }
}
