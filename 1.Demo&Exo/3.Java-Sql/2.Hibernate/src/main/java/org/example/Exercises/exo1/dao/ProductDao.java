package org.example.Exercises.exo1.dao;

import org.example.Exercises.exo1.entity.Product;
import org.example.Exercises.exo1.util.SessionFactorySingleton;
import org.hibernate.Session;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ProductDao extends BaseDao<Product> {

    public ProductDao() {super(SessionFactorySingleton.getSession(), Product.class);}

    //Exo2
    public List<Product> get(){
        return session.createQuery("select p from Product p", Product.class).getResultList();
    }

    public List<Product> get_by_price_min(Double min){
        TypedQuery<Product> query = session.createQuery("Select p from Product p WHERE p.price > :min", Product.class);
        query.setParameter("min",min);
        return query.getResultList();
        //return session.createQuery("select p from Product p WHERE price > :min", Product.class).getResultList();
    }
    //Exo 2-3
    public List<Product> get_between_dates(LocalDate date1, LocalDate date2){
        TypedQuery<Product> query = session.createQuery("Select p from Product p WHERE p.purchase_date BETWEEN :date1 AND :date2", Product.class);
        query.setParameter("date1",date1);
        query.setParameter("date2",date2);
        return query.getResultList();
    }
    //Exo 3
    public List<Object[]> get_by_below_stock_max(int max){
        TypedQuery <Object[]> query= session.createQuery("Select p.id, p.reference from Product p WHERE p.stock < :max", Object[].class);
        query.setParameter("max",max);
        return query.getResultList();
    }

    public List<Object[]> get_stock_by_brand(String brand){
        TypedQuery<Object[]> query = session.createQuery("Select stock, name from Product p WHERE p.brand = :brand", Object[].class);
        query.setParameter("brand",brand);
        return query.getResultList();
    }

    public List<Product> get_by_brand(String brand){
        TypedQuery<Product> query = session.createQuery("Select p from Product p WHERE p.brand = :brand", Product.class);
        query.setParameter("brand",brand);
        return query.getResultList();
    }



    public Double PriceMean(){
        return session.createQuery("select avg(p.price) from Product p", Double.class).uniqueResult(); // Il y a aussi get unique result
    }

    public void delete_by_brand(String brand){
        Query query = session.createQuery("delete from Product p where p.brand = :brand");
        query.setParameter("brand",brand);
        session.beginTransaction();
        query.executeUpdate();
        session.getTransaction().commit();
    }

    public List<Product> get_products_with_score_over(double score_mean){
        TypedQuery<Product> query = session.createQuery(
                "SELECT c.product  FROM Comment c group by c.product HAVING AVG(c.score) > :score_mean", Product.class); //on c.id = p.id
        query.setParameter("score_mean",score_mean);
        return query.getResultList();


    }




}
