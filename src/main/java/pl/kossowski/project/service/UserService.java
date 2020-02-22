package pl.kossowski.project.service;

import ch.qos.logback.classic.spi.EventArgUtil;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.kossowski.project.exception.RoleNotFountException;
import pl.kossowski.project.model.Role;
import pl.kossowski.project.model.User;
import pl.kossowski.project.repository.RoleRepository;
import pl.kossowski.project.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

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
        if(ownerRole.isPresent()){
            return ownerRole.get();
        }throw new RoleNotFountException("Could not find owner role.");

    }
}