package pl.kossowski.project.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.kossowski.project.exception.DuplicatedUsernameException;
import pl.kossowski.project.exception.RoleNotFountException;
import pl.kossowski.project.model.Role;
import pl.kossowski.project.model.User;
import pl.kossowski.project.repository.RoleRepository;
import pl.kossowski.project.repository.UserRepository;


import java.util.*;


@Service

public class UserService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    private Set<User> users = initializeUsers();

    private Set<User> initializeUsers() {
        return new HashSet<>(Arrays.asList(new User("Kuba", "Kuba", "Kuba", "Kuba", "Kuba", "Kuba", "Kuba")));
    }

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userRepository.findById(s).orElseThrow(() -> new UsernameNotFoundException("Could not find user with username: " + s));
    }


    public List<User> findAll() {
        return userRepository.findAll();
    }



    public void addUser(User user) {
        if (userRepository.findById(user.getUsername()).isPresent()) {
            throwDublicationExeption(user.getUsername(), user.getRole());
        }
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    private void throwDublicationExeption(String username, Role role) {
        throw new DuplicatedUsernameException("User " + username + " already exists.", role);
    }

    public void updateUser(User user) {

        userRepository.delete(user);
        userRepository.save(user).getUsername();

    }

    public void deleteUser(String username) {
        userRepository.deleteById(username);
    }

    public Role getGuardianRole() {
        Optional<Role> guardianRole = roleRepository.findById(1L);
        if (guardianRole.isPresent()) {
            return guardianRole.get();
        }
        throw new RoleNotFountException("Could not find guardian role.");
    }

    public Role getOwnerRole() {
        Optional<Role> ownerRole = roleRepository.findById(2L);
        if (ownerRole.isPresent()) {
            return ownerRole.get();
        }
        throw new RoleNotFountException("Could not find owner role.");

    }


}