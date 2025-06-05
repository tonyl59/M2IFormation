package org.example.Exercises.exo1.dao;

import org.example.Exercises.exo1.entity.Comment;
import org.example.Exercises.exo1.entity.Product;
import org.example.Exercises.exo1.util.SessionFactorySingleton;

import javax.persistence.TypedQuery;
import java.util.List;

public class CommentDao extends BaseDao<Comment> {

    public CommentDao() {super(SessionFactorySingleton.getSession(), Comment.class);}


/*select c.product from Comment c group by c.product having avg(c.grade) >= 4*/
}
