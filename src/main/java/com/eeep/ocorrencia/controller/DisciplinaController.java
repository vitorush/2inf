package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Disciplina;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DisciplinaController {

    @GetMapping("/disciplina")
    public String abrirFormulario(Model model) {

        List<Disciplina> disciplinas = new ArrayList<>();

        disciplinas.add(new Disciplina());
        disciplinas.add(new Disciplina());
        disciplinas.add(new Disciplina());

        model.addAttribute("listaDisciplinas", disciplinas);

        return "disciplina.html";
    }
}