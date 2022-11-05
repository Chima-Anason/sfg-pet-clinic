package com.anagracetech.sfgpetclinic.repositories;

import com.anagracetech.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
