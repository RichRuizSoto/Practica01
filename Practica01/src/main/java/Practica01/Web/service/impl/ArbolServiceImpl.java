package Practica01.Web.service.impl;

import Practica01.Web.dao.ArbolDao;
import Practica01.Web.domain.Arbol;
import Practica01.Web.service.ArbolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArbolServiceImpl implements ArbolService {

    private final ArbolDao arbolDao;

    @Override
    public List<Arbol> getArboles() {
        return arbolDao.findAll();
    }

    @Override
    public Arbol getArbolPorId(Long id) {
        return arbolDao.findById(id).orElse(null);
    }

    @Override
    public void save(Arbol arbol) {
        arbolDao.save(arbol);
    }

    @Override
    public void delete(Long id) {
        arbolDao.deleteById(id);
    }
}
