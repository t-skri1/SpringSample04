package com.example.bootSample2.persistence.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bootSample2.persistence.entity.ProductsMaster;

@Repository
public class ProductsMasterRepositoryImpl implements ProductsMasterRepository {
	@Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<ProductsMaster> productsMasterList() {
		String sql = "SELECT * FROM ProductsMaster ORDER BY ProductsCode;";

        List<ProductsMaster> pMList = jdbcTemplate.query(sql,
                (rs, rowNum) -> new ProductsMaster(
                        rs.getString("ProductsCode"),
                        rs.getString("ProductsName"),
                        rs.getInt("UnitPrice")
                        )
                );

        return pMList;
	}
}