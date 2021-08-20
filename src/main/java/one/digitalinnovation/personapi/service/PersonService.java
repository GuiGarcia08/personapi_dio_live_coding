package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.Repository.PersonRepository;
import one.digitalinnovation.personapi.dto.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository repository;

    public MessageResponseDTO cretePerson(Person person) {
        Person savedPerson = repository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
