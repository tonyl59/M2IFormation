package org.example.Exercises.exo1.dao;

import org.example.Exercises.exo1.entity.Image;
import org.example.Exercises.exo1.util.SessionFactorySingleton;

public class ImageDao extends BaseDao<Image> {
    public ImageDao() {super(SessionFactorySingleton.getSession(), Image.class);
    }


}
