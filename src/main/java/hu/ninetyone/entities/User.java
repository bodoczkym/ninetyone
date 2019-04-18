package hu.ninetyone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hu.ninetyone.entities.Products.Bedroom;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(unique = true, nullable = false)
        private String username;

        @JsonIgnore
        @Column(nullable = false)
        private String password;

        @Column(nullable = false)
        private boolean enabled;

        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        private Role role;

        public enum Role {
            ROLE_OWNER, ROLE_USER, GUEST
        }

        @Column(nullable = true)
        private String reference;

        @Column(nullable = true)
        private String description;

        @Column(nullable = true)
        private int rates;

        @Column(nullable = true)
        private int voters;

        @Column(nullable = true)
        private String img;

        @Column(nullable = false)
        private String email;

        @Column(nullable = false)
        private Boolean emailVerified = false;

        @OneToMany(mappedBy = "user")
        @JsonIgnore
        private List<Feedback> feedback;
}
