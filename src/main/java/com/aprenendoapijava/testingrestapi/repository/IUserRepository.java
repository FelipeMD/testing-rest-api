package com.aprenendoapijava.testingrestapi.repository;

import com.aprenendoapijava.testingrestapi.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserModel, Integer> {
}
