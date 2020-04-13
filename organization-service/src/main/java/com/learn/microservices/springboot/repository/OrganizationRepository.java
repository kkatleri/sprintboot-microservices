package com.learn.microservices.springboot.repository;

import com.learn.microservices.springboot.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,String> {
}