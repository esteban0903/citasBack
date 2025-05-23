package edu.eci.parcial.Factura.Service;

import edu.eci.parcial.Factura.Repository.UserRepository;
import edu.eci.parcial.Factura.Model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }
}

