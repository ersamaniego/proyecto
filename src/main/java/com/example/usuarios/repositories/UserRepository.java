package com.example.usuarios.repositories;

import com.example.usuarios.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository <User, Long>{
}
