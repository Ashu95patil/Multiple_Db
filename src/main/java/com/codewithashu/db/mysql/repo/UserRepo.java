package com.codewithashu.db.mysql.repo;


import com.codewithashu.db.mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
