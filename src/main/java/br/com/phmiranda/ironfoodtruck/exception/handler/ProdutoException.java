/*
 * Project: ironfoodtruck
 * Task/User Story: nº 99
 * Jira Project: GRUPOCDC
 * Description: N/A
 */

package br.com.phmiranda.ironfoodtruck.exception.handler;

import br.com.phmiranda.ironfoodtruck.domain.dto.handler.BaseValidacaoDto;
import br.com.phmiranda.ironfoodtruck.exception.BaseException;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;

public class ProdutoException implements BaseException {
    @Override
    public List<BaseValidacaoDto> handle(MethodArgumentNotValidException exception) {
        return null;
    }
}
