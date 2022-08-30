package org.example.services;

public interface IService<T> {
    void insert(T clase);
    void update(T clase);
    void getAllInfo(T clase);
    void delete(T clase);

}
