package com.sura.expenses.config.handlerexception;


import com.sura.expenses.exception.ArgumentException;
import com.sura.expenses.exception.LengthException;
import com.sura.expenses.exception.RequiredException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

@ControllerAdvice
@Slf4j
public class HandleException {

    private static final String INTERNAL_ERR_MESSAGE = "Error interno, porfavor comunicarse con soporte.";
    private static final ConcurrentHashMap<String, Integer> STATUS_CODE = new ConcurrentHashMap<>();

    public HandleException(){
        STATUS_CODE.put(ArgumentException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
        STATUS_CODE.put(LengthException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
        STATUS_CODE.put(RequiredException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(Exception exception){
        String exceptionName = exception.getClass().getSimpleName();
        String exceptionMessage = exception.getMessage();
        Integer statusCode = STATUS_CODE.get(exceptionName);
        Error error;
        Date dateException = new Date();
        if (statusCode == null){
            log.error(exceptionName,exception);
            error = new Error(exceptionName, INTERNAL_ERR_MESSAGE, dateException);
            return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        error = new Error(exceptionName, exceptionMessage, dateException);
        return new ResponseEntity<>(error, HttpStatus.valueOf(statusCode));
    }

}
