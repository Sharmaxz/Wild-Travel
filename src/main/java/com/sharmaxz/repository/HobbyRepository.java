package com.sharmaxz.repository;

import com.sharmaxz.model.Hobby;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepository extends CrudRepository<Hobby, Long> {
}
