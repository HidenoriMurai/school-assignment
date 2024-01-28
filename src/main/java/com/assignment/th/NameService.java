package com.assignment.th;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameService {

    private NameMapper nameMapper;

    public NameService(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    public List<Name> getAll() {
        return nameMapper.getAll();
    }
}
