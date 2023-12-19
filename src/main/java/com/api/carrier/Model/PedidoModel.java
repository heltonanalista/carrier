package com.api.carrier.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoModel {
        private Long id;
        private ClientePedidoModel clientePedidoModel;
        private FornecedorPedidoModel fornecedorPedidoModel;
        private PecaPedidoModel pecaPedidoModel;
        private Integer quantidade;


}
