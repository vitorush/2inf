package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Disciplina;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/disciplina")
public class DisciplinaController {

    private ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();

    @GetMapping
    public String abrirFormulario(Model model) {

        model.addAttribute("disciplina", new Disciplina());
        model.addAttribute("listaDisciplinas", listaDisciplinas);

        return "disciplina";
    }

    @PostMapping("/salvar")
    public String salvarDisciplina(Disciplina disciplina) {

        listaDisciplinas.add(disciplina);

        System.out.println(disciplina.getCodigo());
        System.out.println(disciplina.getNome());

        return "redirect:/disciplina";
    }
}