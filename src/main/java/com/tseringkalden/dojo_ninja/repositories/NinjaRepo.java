package com.tseringkalden.dojo_ninja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tseringkalden.dojo_ninja.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{

}
