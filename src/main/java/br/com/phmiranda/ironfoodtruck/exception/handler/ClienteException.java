/*
 * Project: ironfoodtruck
 * Task/User Story: nº 99
 * Jira Project: GRUPOCDC
 * Description: N/A
 */

package br.com.phmiranda.ironfoodtruck.exception.handler;

import br.com.phmiranda.ironfoodtruck.exception.BaseException;
import br.com.phmiranda.ironfoodtruck.domain.dto.handler.BaseValidacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.ArrayList;
import java.util.List;

public class ClienteException implements BaseException {
    @Autowired
    private MessageSource mensagemSource;

    @Override
    public List<BaseValidacaoDto> handle(MethodArgumentNotValidException exception) {
        List<BaseValidacaoDto> validacoes = new ArrayList<>();
        List<FieldError> responses = exception.getBindingResult().getFieldErrors();
        responses.forEach(error -> {
                String mensagem = mensagemSource.getMessage(error, LocaleContextHolder.getLocale());
                BaseValidacaoDto erros = new BaseValidacaoDto(error.getField(), mensagem);
                validacoes.add(erros);
        });
        return validacoes;
    }
}
