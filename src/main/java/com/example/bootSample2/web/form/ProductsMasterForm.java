package com.example.bootSample2.web.form;

import java.util.List;

import com.example.bootSample2.persistence.entity.ProductsMaster;

import lombok.Data;

@Data
public class ProductsMasterForm {
	private List<ProductsMaster> pmList;
}