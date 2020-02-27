package com.iraunchy.springwebtraining.services.map;

import com.iraunchy.springwebtraining.model.Owner;
import com.iraunchy.springwebtraining.services.OwnerService;
import com.iraunchy.springwebtraining.services.PetService;
import com.iraunchy.springwebtraining.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner Owner) {
        super.delete(Owner);
    }

    @Override
    public Owner save(Owner Owner) {
        return super.save(Owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
