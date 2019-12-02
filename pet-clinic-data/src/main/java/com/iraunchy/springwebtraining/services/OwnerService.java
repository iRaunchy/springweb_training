package com.iraunchy.springwebtraining.services;

import com.iraunchy.springwebtraining.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
