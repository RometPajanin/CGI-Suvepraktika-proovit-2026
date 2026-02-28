package com.example.cgisuvepraktikaproovitoo2026;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tables")
public class TableController {

    private final TableRepository tableRepository;

    public TableController(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    @GetMapping("/create")
    public String createTableForm(Model model) {
        model.addAttribute("table", new Table());
        return "create_table.html";
    }

    @PostMapping("/create")
    public String createTable(@ModelAttribute Table table) {
        tableRepository.save(table);
        return "redirect:/";
    }
}
