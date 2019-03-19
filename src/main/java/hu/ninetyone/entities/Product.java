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
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column
        @NotNull
        private String productname;

        @Column
        @NotNull
        private String stocknumber;

        @Column
        @NotNull
        private String description;


        @Column
        @NotNull
        private int price;
        @Column
        @CreationTimestamp
        private LocalDateTime created_at;

        @Column
        @UpdateTimestamp
        private LocalDateTime updated_at;

        @ManyToOne
        @JoinColumn
        @JsonIgnore
        private Category category;//!!!INFO:itt es a Category mapjeben ugyanannak kell szerepelni

        @OneToMany(mappedBy = "product")
        @JsonIgnore
        private List<Purchase> purchase;



}
