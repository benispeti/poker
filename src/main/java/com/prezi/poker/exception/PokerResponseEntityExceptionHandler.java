package com.prezi.poker.exception;

import org.apache.commons.lang3.StringUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class PokerResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {EmptyResultDataAccessException.class})
    protected ResponseEntity<Object> handleEmptyResultDataAccess(RuntimeException ex, WebRequest request) {
        String msg = StringUtils.isNotEmpty(ex.getMessage()) ? ex.getMessage() : "Data was not found!";
        return handleExceptionInternal(ex, msg, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
