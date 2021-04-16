/**
 * Project: ironfood
 * Date: 15/06/2020
 * User: phmiranda
 * Descrição: controller responsável por realizar a comunicação com os recursos do tipo Cliente até a base de dados.
 */

package br.com.phmiranda.ironfood.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping
    public String index() {
        return "Olá...";
    }
}
