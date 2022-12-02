/*
 * Project: ironfoodtruck
 * Task/User Story: nº 99
 * Jira Project: GRUPOCDC
 * Description: N/A
 */

package br.com.phmiranda.ironfoodtruck.exception;

import br.com.phmiranda.ironfoodtruck.domain.dto.handler.BaseValidacaoDto;
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
