package com.assignment.th;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {
    private final NameMapper nameMapper;

    public NameController(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @GetMapping("/allnames")
    public List<Name> getAll() {
        return nameMapper.getAll();
    }

    @GetMapping("/names")
    public List<Name> getByNames(@RequestParam String startsWith) {
        List<Name> names = nameMapper.getByNameStartsWith(startsWith);
        return names;
    }
}
