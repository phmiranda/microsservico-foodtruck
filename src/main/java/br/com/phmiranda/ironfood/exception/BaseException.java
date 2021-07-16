/*
 * Author: Pedro
 * Project: ironfood
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: DESCRIPTION OF USER HISTORY
 * Date: 08/07/2021
 */

package br.com.phmiranda.ironfood.exception;

import br.com.phmiranda.ironfood.exception.validation.BaseValidacaoDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ControllerAdvice
public interface BaseException {
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<BaseValidacaoDto> handle(MethodArgumentNotValidException exception);
}
