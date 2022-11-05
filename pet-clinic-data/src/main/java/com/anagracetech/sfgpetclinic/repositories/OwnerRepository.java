package com.anagracetech.sfgpetclinic.repositories;

import com.anagracetech.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
