package com.api.carrier.controller;

import com.api.carrier.Model.PedidoModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("encomenda")
public class EncomendaController {
    @PostMapping()
    public void receber(@RequestBody PedidoModel pedidoModel){


        System.out.println(pedidoModel);

    }
}
