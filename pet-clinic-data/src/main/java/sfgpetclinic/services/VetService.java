package sfgpetclinic.services;

import sfgpetclinic.model.Owner;
import sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Owner findById(Long id);
    Owner save(Vet vet);
    Set<Vet> findAll();

}
