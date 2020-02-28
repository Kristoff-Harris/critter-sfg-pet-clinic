package sfgpetclinic.services;

import sfgpetclinic.model.Owner;
import sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Owner findById(Long id);
    Owner save(Pet pet);
    Set<Pet> findAll();

}
