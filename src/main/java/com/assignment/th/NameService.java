package com.assignment.th;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NameService {

    private final NameMapper nameMapper;

    public NameService(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    public List<Name> getByNameStartsWith(Optional<String> startsWith) {
        if (startsWith.isEmpty()) {
            return nameMapper.getAll();
        } else {
            return nameMapper.getByNameStartsWith(startsWith.get());
        }
    }
}
