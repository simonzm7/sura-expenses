package com.sura.expenses.exception;

public class RequiredException extends RuntimeException{
    public RequiredException(String message){
        super(message);
    }
}
