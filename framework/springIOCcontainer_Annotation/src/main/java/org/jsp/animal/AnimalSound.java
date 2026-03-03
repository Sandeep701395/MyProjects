package org.jsp.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class AnimalSound {
	@Autowired
	@Qualifier("cat")
	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void doSound()
	{
		animal.sound();
	}
}
