/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.MSCatastro.dao;

import com.acosux.MSCatastro.util.AnxCatastroMicroempresa;
import com.acosux.MSCatastro.util.dao.GenericDao;

/**
 *
 * @author Trabajo
 */
public interface CatastroMicroempresaDao extends GenericDao<AnxCatastroMicroempresa, Integer> {

    public boolean existeCatastroMicroEmpresa(String codigo) throws Exception;
}
