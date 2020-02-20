package pl.kossowski.project.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Animal {
   @Id
    private String nickname;
    private String nameAnimal;
    private String race;

    public Animal(String nickname, String nameAnimal, String race) {
        this.nickname = nickname;
        this.nameAnimal = nameAnimal;
        this.race = race;
    }

    public Animal() {
    }
}
