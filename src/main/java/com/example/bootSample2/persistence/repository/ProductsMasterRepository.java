package com.example.bootSample2.persistence.repository;

import java.util.List;

import com.example.bootSample2.persistence.entity.ProductsMaster;

public interface ProductsMasterRepository {
    List<ProductsMaster> productsMasterList();
}