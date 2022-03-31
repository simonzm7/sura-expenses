package com.sura.expenses.employee.model.validation;

import com.sura.expenses.exception.ArgumentException;
import com.sura.expenses.exception.LengthException;
import com.sura.expenses.exception.RequiredException;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor
public class ArgumentValidation {

    public static void notNull(Object data, String errorMessage){
        if(data == null || data.toString().isBlank() || data.toString().isEmpty()){
            throw new RequiredException(errorMessage);
        }
    }

    public static void validateRegex(String regex, String data, String errorMessage){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        if(!matcher.matches()){
            throw new ArgumentException(errorMessage);
        }
    }

    public static void validateMinLength(Long value, Integer minValue, String errorMessage){
        if (value <= minValue){
            throw new LengthException(errorMessage);
        }
    }

}
