package com.example.onetoonebirectional.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Getter
@Setter
@Entity
@Table(name = "address")
public class        AddressEntity {
    @Id
    private Long id;
    @Column(name = "address_one")
    private String address1;
    @Column(name = "address_two")
    private String address2;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "zip_code")
    private String zipcode;
    @MapsId
    @OneToOne
    @JoinColumn(name = "id")

    private PersonEntity person;

}