package es.indra.repository;

import es.indra.model.User;

public interface UserRepository {
    User findByUsername(String username);
}
