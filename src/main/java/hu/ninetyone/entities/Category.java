package hu.ninetyone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hu.ninetyone.entities.Products.*;
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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String categoryName;

    @Column
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime updated_at;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Bathroom> bath;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Bedroom> bed;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Kitchen> kitchen;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Livingroom> living;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Techs> techs;
}
