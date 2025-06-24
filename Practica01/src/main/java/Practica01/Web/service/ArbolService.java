package Practica01.Web.service;

import Practica01.Web.domain.Arbol;
import java.util.List;

public interface ArbolService {
    public List<Arbol> getArboles();
    public void guardar(Arbol arbol);
    public void eliminar(Arbol arbol);
    public Arbol getArbol(Arbol arbol);
}
