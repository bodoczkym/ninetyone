package hu.ninetyone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(unique = true)
        private String username;

        @Column(nullable = false)
        private String password;

        @Column(nullable = false)
        private boolean enabled;

        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        private Role role;

        public enum Role {
            ROLE_OWNER, ROLE_USER
        }

        @Column(nullable = true)
        private String reference;

        @Column(nullable = true)
        private String description;

        @Column(nullable = true)
        private int rate;

        @Column(nullable = true)
        private String img;

        @Column(nullable = true)
        private String email;

        @OneToMany(mappedBy = "user")
        @JsonIgnore
        private List<Purchase> purchase;



}
