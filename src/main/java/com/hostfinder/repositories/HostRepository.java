package com.hostfinder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostfinder.domain.Host;

@Repository
public interface HostRepository extends JpaRepository<Host, Integer>{
	
}
