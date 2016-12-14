package br.com.caio;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by caioaraujo on 14/12/16.
 */

@Entity(name = "demo_user")
@Data
public class User {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
    private String username;
    private String password;
}
