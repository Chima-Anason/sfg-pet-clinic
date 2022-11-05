package com.anagracetech.sfgpetclinic.repositories;

import com.anagracetech.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
