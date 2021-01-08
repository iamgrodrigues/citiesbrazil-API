package com.iamgrodrigues.citiesbrazilapi.cities.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "cidade")
@AllArgsConstructor
@NoArgsConstructor
//@TypeDefs(value = {
//        @TypeDef(name = "point", typeClass = PointType.class)
//})
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    // 1st
    @Column(name = "lat_lon")
    private String geolocation;

    // 2nd
//    @Type(type = "point")
//    @Column(name = "lat_lon", updatable = false, insertable = false)
//    private Point location;

}
