package com.assignment.th;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {
    private final NameService nameServiceer;

    public NameController(NameService nameServiceer) {
        this.nameServiceer = nameServiceer;
    }

    @GetMapping("/names")
    public List<Name> getByNames() {
        return nameServiceer.getAll();
    }
}
