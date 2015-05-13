package com.company;

public class NoSolutionException extends Exception{

    private String message = "Нет корней";

    public NoSolutionException() {

    }

    @Override
    public String getMessage() {
        return message;
    }
}
