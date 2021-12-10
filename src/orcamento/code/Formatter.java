/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orcamento.code;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author eharv
 */
public class Formatter {
    
    //Para retornar os valores em R$
    public String format(double valor) {

        String valorFormatado = NumberFormat.getCurrencyInstance(Locale.getDefault()).format(valor);
        return valorFormatado;

    }

}
