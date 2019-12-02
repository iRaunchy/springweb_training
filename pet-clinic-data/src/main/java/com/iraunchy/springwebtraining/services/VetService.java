package com.iraunchy.springwebtraining.services;

import com.iraunchy.springwebtraining.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);

}
