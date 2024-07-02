package vn.edu.likelion.app.Day11.Exercise.Bai2.Interface;

public interface CRUDInterface<T> {
    void insert(T Object);
    void update(T Object);
    void showAlls();
    void remove(T Object);
    void getAll();
    void getById(String id);
    void getByName(String name);
    void showById(String id);
    void showByName(String name);
}
