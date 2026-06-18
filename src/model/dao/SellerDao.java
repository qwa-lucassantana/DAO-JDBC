package model.dao;

import model.entities.Seller;

import java.util.List;

public class SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();

}
