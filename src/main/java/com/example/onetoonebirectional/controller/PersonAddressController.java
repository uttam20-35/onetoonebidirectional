package com.example.onetoonebirectional.controller;

import com.example.onetoonebirectional.model.Person;
import com.example.onetoonebirectional.model.PersonResponse;
import com.example.onetoonebirectional.service.PersonAddressService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class PersonAddressController {
    @Autowired
    private PersonAddressService personAddressService;

    @PostMapping(path = "/persons", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonResponse> createPerson(@RequestBody Person person) {
        PersonResponse createResponse = personAddressService.createPerson(person);
        log.info("person Successfully Created");
        return new ResponseEntity<>(createResponse, HttpStatus.OK);

    }
    @GetMapping(path = "/persons/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {
        Person getPerson = personAddressService.getPerson(id);
        log.info("person Successfully retrived");
        return new ResponseEntity<>(getPerson, HttpStatus.OK);
    }
    @PutMapping(path = "/persons/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void>updatePerson(@PathVariable Long id,@RequestBody Person person){
        personAddressService.updatePerson(id,person);
        return ResponseEntity.ok().build();

    }
    @DeleteMapping(path = "/persons/{id}")
    public ResponseEntity<Void>deletePerson(@PathVariable Long id){
        personAddressService.deletePerson(id);
        return ResponseEntity.ok().build();
    }
}
