package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import com.bean.Buyer;
import com.bean.Flat;
import com.repository.BuyerRepository;
import com.repository.FlatRepository;

@Repository
public class BuyerDAO {

    @Autowired
    private BuyerRepository buyerRepository;

    @Autowired
    private FlatRepository flatRepository;

    @Autowired
    private EntityManager entityManager;

    public void addBuyer(Buyer buyer) {
        buyerRepository.save(buyer);
    }

    public void addFlat(String buyerId, Flat flat) {
        Buyer buyer = buyerRepository.findById(buyerId).orElseThrow(() -> new RuntimeException("Buyer not found"));
        flat.setBuyer(buyer);
        flatRepository.save(flat);
    }

    public List<Flat> flatWithMinPriceMaxRooms() {
        String jpql = "SELECT f FROM Flat f WHERE f.flatPrice = (SELECT MIN(f1.flatPrice) FROM Flat f1) AND f.numberOfRooms = (SELECT MAX(f2.numberOfRooms) FROM Flat f2)";
        TypedQuery<Flat> query = entityManager.createQuery(jpql, Flat.class);
        return query.getResultList();
    }
}