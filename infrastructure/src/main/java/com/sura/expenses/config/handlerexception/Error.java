package com.sura.expenses.config.handlerexception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class Error {
    private String nameExeception;
    private String message;
    private Date timestamp;
}
