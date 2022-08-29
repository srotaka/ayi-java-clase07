package org.example.services;

public interface IPersonaService <T> {
    void insert(T clase);
    void update(T clase);
    void getAllInfo(T clase);
    void delete(T clase);

}
