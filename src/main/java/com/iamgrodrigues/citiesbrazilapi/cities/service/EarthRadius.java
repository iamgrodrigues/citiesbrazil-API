package com.iamgrodrigues.citiesbrazilapi.cities.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EarthRadius {
    METERS("m", 6378168),
    KILOMETERS("km", 6378.168f),
    MILES("mi", 3958.747716f);

    private final String unit;
    private final float value;
}
