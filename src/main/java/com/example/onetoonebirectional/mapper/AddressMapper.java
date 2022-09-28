package com.example.onetoonebirectional.mapper;

import com.example.onetoonebirectional.entity.AddressEntity;
import com.example.onetoonebirectional.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface AddressMapper {
    AddressEntity addressToEntity(Address address);
    Address addressEntityToAddress(AddressEntity addressEntity);

}
