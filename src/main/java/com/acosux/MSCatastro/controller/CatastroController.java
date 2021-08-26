/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.MSCatastro.controller;

import com.acosux.MSCatastro.service.CatastroMicroempresaService;
import com.acosux.MSCatastro.util.RespuestaWebTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Trabajo
 */
@RestController
@RequestMapping("/catastro/")
public class CatastroController {

    @Autowired
    CatastroMicroempresaService catastroMicroempresaService;

    @RequestMapping(value = "/existeCatastroMicroEmpresa/{identificacion}", method = {RequestMethod.GET})
    public RespuestaWebTO existeCatastroMicroEmpresa(@PathVariable("identificacion") String identificacion) {
        RespuestaWebTO resp = new RespuestaWebTO();
        resp.setEstadoOperacion(RespuestaWebTO.EstadoOperacionEnum.ADVERTENCIA.getValor());
        try {
            boolean respues = catastroMicroempresaService.existeCatastroMicroEmpresa(identificacion);
            resp.setExtraInfo(respues);
        } catch (Exception e) {
            resp.setEstadoOperacion(RespuestaWebTO.EstadoOperacionEnum.ERROR.getValor());
            resp.setOperacionMensaje(e.getMessage());
        }
        return resp;
    }
}
