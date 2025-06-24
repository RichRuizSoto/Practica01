package Practica01.Web.dao;

import Practica01.Web.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbolDao extends JpaRepository<Arbol, Long> {
}
