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
            List<Name> result = nameMapper.getByNameStartsWith(startsWith.get());
            if (result.isEmpty()) {
                throw new UserNotFoundException(startsWith.get() + " で始まる名前は存在しません。");
            }
            return result;
        }
    }
}
