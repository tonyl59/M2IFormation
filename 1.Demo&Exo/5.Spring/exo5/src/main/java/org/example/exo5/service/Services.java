package org.example.exo5.service;

import java.util.List;;


public interface Services<T> {

    T create(T entity);
    List<T> getAll();
    void delete(Long id);
    T getById(Long id);
    T update(Long id);
}
