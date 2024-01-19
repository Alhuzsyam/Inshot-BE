package com.inshot.inshotTest.dto;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response <T> {
    private String status;
    private ArrayList<String> message = new ArrayList<>();
    private T payload;
}
