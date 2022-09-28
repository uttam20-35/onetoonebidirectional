package com.example.onetoonebirectional.mapper;

import com.example.onetoonebirectional.entity.PersonEntity;
import com.example.onetoonebirectional.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface PersonMapper {
    PersonEntity personToEntity(Person person);
    Person entityToPerson(PersonEntity personEntity);

}
