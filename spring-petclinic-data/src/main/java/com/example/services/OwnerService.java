package com.example.services;

import com.example.model.Owner;
import com.example.model.Person;


public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);

}
