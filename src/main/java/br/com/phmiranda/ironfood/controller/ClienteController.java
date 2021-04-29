/**
 * User: phmiranda
 * Project: ironfood
 * Description: this class execute...!
 * Date: 15/06/2020
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
        return "Olá, bem vindo a página de clientes...";
    }
}
