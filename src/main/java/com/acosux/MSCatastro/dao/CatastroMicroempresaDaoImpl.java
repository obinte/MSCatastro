/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.MSCatastro.dao;

import com.acosux.MSCatastro.util.AnxCatastroMicroempresa;
import com.acosux.MSCatastro.util.UtilsConversiones;
import com.acosux.MSCatastro.util.dao.GenericDaoImpl;
import com.acosux.MSCatastro.util.dao.GenericSQLDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Trabajo
 */
@Repository
public class CatastroMicroempresaDaoImpl extends GenericDaoImpl<AnxCatastroMicroempresa, Integer> implements CatastroMicroempresaDao {

    @Autowired
    private GenericSQLDao genericSQLDao;

    @Override
    public boolean existeCatastroMicroEmpresa(String identificacion) throws Exception {
        String sql = "SELECT COUNT(*)!=0 FROM anexo.anx_catastro_microempresa WHERE cat_ruc='" + identificacion + "'";
        return (boolean) UtilsConversiones.convertir(genericSQLDao.obtenerObjetoPorSql(sql));
    }

}
