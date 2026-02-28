package com.example.cgisuvepraktikaproovitoo2026;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class TableController {

    private final TableRepository tableRepository;

    public TableController(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    @GetMapping("/tables")
    public String createTableForm(Model model) {
        model.addAttribute("table", new Table());
        model.addAttribute("tables", tableRepository.findAll());
        return "tables";
    }

    @PostMapping("/create-table")
    public String createTable(@ModelAttribute("table") Table table, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("tables", tableRepository.findAll());
            return "tables";
        }
        tableRepository.save(table);
        return "redirect:/tables";
    }

    @PostMapping("/delete-table/{id}")
    public String deleteTable(@PathVariable("id") UUID id) {
        tableRepository.deleteById(id);
        return "redirect:/tables";
    }
}
