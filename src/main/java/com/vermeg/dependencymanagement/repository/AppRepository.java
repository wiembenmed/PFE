package com.vermeg.dependencymanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vermeg.dependencymanagement.entity.Application;

import java.util.List;


public interface AppRepository extends JpaRepository<Application,Long>{


    @Override
    List<Application> findAll();
    Application getOne(Long id);
}
