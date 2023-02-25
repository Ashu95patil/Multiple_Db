package com.codewithashu.db.postgres.repo;

import com.codewithashu.db.postgres.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
