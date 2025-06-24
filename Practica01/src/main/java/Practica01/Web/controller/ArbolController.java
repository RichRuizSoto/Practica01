package Practica01.Web.controller;

import Practica01.Web.domain.Arbol;
import Practica01.Web.service.ArbolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/arbol")
public class ArbolController {

    private final ArbolService arbolService;

@GetMapping("/listado")
public String listado(Model model) {
    var lista = arbolService.getArboles();
    model.addAttribute("arboles", lista);
    model.addAttribute("totalArboles", lista.size());

    // 🔽 ESTA LÍNEA ES FUNDAMENTAL PARA FORMULARIOS
    model.addAttribute("arbol", new Arbol());

    return "arbol/listado";
}


    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Arbol arbol) {
        arbolService.save(arbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/eliminar/{idArbol}")
    public String eliminar(@PathVariable Long idArbol) {
        arbolService.delete(idArbol);
        return "redirect:/arbol/listado";
    }

    @GetMapping("/modificar/{idArbol}")
    public String modificar(@PathVariable Long idArbol, Model model) {
        var arbol = arbolService.getArbolPorId(idArbol);
        model.addAttribute("arbol", arbol);
        return "arbol/modifica";
    }

    @GetMapping("/")
    public String inicio() {
        return "redirect:/arbol/listado";
    }
}
