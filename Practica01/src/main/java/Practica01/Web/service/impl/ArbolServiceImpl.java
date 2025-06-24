package Practica01.Web.service.impl;

import Practica01.Web.dao.ArbolDao;
import Practica01.Web.domain.Arbol;
import Practica01.Web.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArbolServiceImpl implements ArbolService {

    @Autowired
    private ArbolDao arbolDao;

    @Override
    public List<Arbol> getArboles() {
        return (List<Arbol>) arbolDao.findAll();
    }

    @Override
    public void guardar(Arbol arbol) {
        arbolDao.save(arbol);
    }

    @Override
    public void eliminar(Arbol arbol) {
        arbolDao.delete(arbol);
    }

    @Override
    public Arbol getArbol(Arbol arbol) {
        return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }
}
