package com.tseringkalden.dojo_ninja.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tseringkalden.dojo_ninja.models.Dojo;
import com.tseringkalden.dojo_ninja.models.Ninja;
import com.tseringkalden.dojo_ninja.repositories.DojoRepo;
import com.tseringkalden.dojo_ninja.repositories.NinjaRepo;

@Service
public class AppService {
	@Autowired
	private DojoRepo dojorepo;
	
	private final NinjaRepo ninjarepo;
	
	public AppService(NinjaRepo ninjarepo) {
		this.ninjarepo = ninjarepo;
	}

	public void createDojo(@Valid Dojo dojo) {
		// TODO Auto-generated method stub
		dojorepo.save(dojo);
	}

	public List<Dojo> getAllDojos() {
		// TODO Auto-generated method stub
		return dojorepo.findAll();
	}

	public void createNinja(@Valid Ninja ninja) {
		// TODO Auto-generated method stub
		ninjarepo.save(ninja);
		
	}

	public Dojo getDojo(Long id){
		Optional<Dojo> dojo = dojorepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
			
		}
		else {
			return null;
		}
	}
	
	public Optional<Ninja> getNinja(Long id){
		return ninjarepo.findById(id);
	}

	public Dojo findDojo(Long id) {
	    Optional<Dojo> optionalDojo = dojorepo.findById(id);
	    if(optionalDojo.isPresent()) {
	        return optionalDojo.get();
	    } else {
	        return null;
	    }
	}
}
