/**
 * User: phmiranda
 * Project: ironfood
 * Description: this class execute...!
 * Date: 29/04/2021
 */

package br.com.phmiranda.ironfood.service;

import br.com.phmiranda.ironfood.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public void index(){

    }
}
