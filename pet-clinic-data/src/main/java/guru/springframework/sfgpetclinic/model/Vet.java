package guru.springframework.sfgpetclinic.model;

import java.time.LocalTime;

public class Vet extends Person {
	
	private PetType petType;
	private Owner owner;
	private LocalTime birtDate;
	
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalTime getBirtDate() {
		return birtDate;
	}
	public void setBirtDate(LocalTime birtDate) {
		this.birtDate = birtDate;
	}
}
