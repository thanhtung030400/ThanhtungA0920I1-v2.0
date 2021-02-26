package Furama_resort.exceptions;

public class BirthdayException extends Exception{

    public BirthdayException(){
        super("birthday >1900, less than current year, format dd/mm/yy");
    }
}
