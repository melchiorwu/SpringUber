package com.chaoyu.spring.uber.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@RequiredArgsConstructor
@AllArgsConstructor // leave possible
@Embeddable
public class UnitInfo {
    private final String unitVin;
    private String engineMake;
    private String customerName;
    private String unitNumber;

    @SuppressWarnings("unused")
    private UnitInfo() {
        this.unitVin = "";
    }
}
