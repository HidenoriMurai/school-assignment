package com.assignment.th;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameService {

    private final NameMapper nameMapper;

    public NameService(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    public List<Name> getAll() {
        return nameMapper.getAll();
    }

    public List<Name> getByNameStartsWith(String startsWith) {
        List<Name> result = nameMapper.getByNameStartsWith(startsWith);
        if (result.isEmpty()) {
            throw new UserNotFoundException(startsWith + " で始まる名前は存在しません。");
        } else {
            return nameMapper.getByNameStartsWith(startsWith);
        }
    }
}
