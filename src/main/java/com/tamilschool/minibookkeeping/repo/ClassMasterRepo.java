package com.tamilschool.minibookkeeping.repo;

import com.tamilschool.minibookkeeping.model.ClassMaster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassMasterRepo extends CrudRepository <ClassMaster, Integer> {
    //List<ClassMaster> findAll();

}
