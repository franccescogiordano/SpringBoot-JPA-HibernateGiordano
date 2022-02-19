package com.sofka.CrudYJPAGiordano.repository;

import com.sofka.CrudYJPAGiordano.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleJpaRepository extends JpaRepository<Role,Long>{
    Role findByName(String name);

}