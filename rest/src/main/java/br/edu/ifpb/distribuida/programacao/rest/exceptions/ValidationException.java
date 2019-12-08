package br.edu.ifpb.distribuida.programacao.rest.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends StandardError {

    List<FieldMessage> errors = new ArrayList<>();

    public ValidationException(Long timestamp, Integer status, String error, String message, String path) {
        super(timestamp, status, error, message, path);
    }

    public List<FieldMessage> getErrors(){
        return errors;
    }

    public void addError(String fieldName, String mensagem){
        errors.add(new FieldMessage(fieldName, mensagem));
    }
}