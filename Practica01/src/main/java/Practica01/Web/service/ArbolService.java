package Practica01.Web.service;

import Practica01.Web.domain.Arbol;
import java.util.List;

public interface ArbolService {
    List<Arbol> getArboles();
    Arbol getArbolPorId(Long id);
    void save(Arbol arbol);
    void delete(Long id);
}
