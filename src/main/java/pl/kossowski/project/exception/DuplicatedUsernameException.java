package pl.kossowski.project.exception;

import pl.kossowski.project.model.Role;

public class DuplicatedUsernameException extends RuntimeException {

    private final Role role;
    public DuplicatedUsernameException(String message, Role role) {
        super(message);
        this.role = role;
    }

    public Role getRole() {
        return role;
    }
}
