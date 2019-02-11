package hu.ninetyone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String order_name;

    @Column
    @NotNull
    private String address;

    @Column
    @NotNull
    private String phone_number;

    @Column
    @NotNull
    private boolean isDelivered;

    @Column
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime updated_at;

   /* @ManyToMany
    @JoinColumn
    @JsonIgnore
    private User user;*/

   /* @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Product product;*/
}
