package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private  final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Juan");
		owner1.setLastName("Ledesma");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Carlos");
		owner2.setLastName("Alvear");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded owners...");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Max");
		vet1.setLastName("Steel");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Lucca");
		vet2.setLastName("Modric");
		
		vetService.save(vet2);
		
		System.out.println("Loaded vets...");
		
		}

}
