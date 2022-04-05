package com.kelmorgan.mynetflux.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class MovieEvent {

    private String movieId;
    private Date movieData;
}
