package com.iraunchy.springwebtraining.bootstrap;

import com.iraunchy.springwebtraining.model.Owner;
import com.iraunchy.springwebtraining.model.Pet;
import com.iraunchy.springwebtraining.model.PetType;
import com.iraunchy.springwebtraining.model.Vet;
import com.iraunchy.springwebtraining.services.OwnerService;
import com.iraunchy.springwebtraining.services.PetTypeService;
import com.iraunchy.springwebtraining.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231245156");
        Pet owner1Pet = new Pet();
        owner1Pet.setPetType(savedDogType);
        owner1Pet.setOwner(owner1);
        owner1Pet.setName("Jake");
        owner1Pet.setBirthDate(LocalDate.now());
        owner1.getPets().add(owner1Pet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennane");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231245156");
        Pet owner2Pet = new Pet();
        owner2Pet.setPetType(savedCatType);
        owner2Pet.setOwner(owner2);
        owner2Pet.setName("Mursik");
        owner2Pet.setBirthDate(LocalDate.now());
        owner2.getPets().add(owner2Pet);

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded vets....");

    }
}
