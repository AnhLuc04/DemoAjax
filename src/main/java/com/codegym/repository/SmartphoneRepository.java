package com.codegym.repository;

import com.codegym.model.Smartphone;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SmartphoneRepository extends CrudRepository<Smartphone, Integer> {
}