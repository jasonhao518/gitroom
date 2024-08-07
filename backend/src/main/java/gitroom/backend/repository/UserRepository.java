package gitroom.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import gitroom.backend.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
}