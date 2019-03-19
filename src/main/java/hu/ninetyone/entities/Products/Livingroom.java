package hu.ninetyone.entities.Products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hu.ninetyone.entities.Category;
import hu.ninetyone.entities.Purchase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Livingroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private Integer stocknumber;

    @Column(nullable = false)
    @OneToMany(targetEntity=Livingroom.class)
    private List<String> filters = Arrays.asList("couch", "armchair", "smoking table", "tv table", "cabinet",
             "cupboard");

    private enum TableType {
        wood, metal, plastic
    }

    private enum SittingTypes {
        wood, textil
    }

    @Column(nullable = true)
    private String description;

    @Column(nullable = true)
    private int rate;

    @Column(nullable = true)
    private String img;

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
    private Category category;

    @OneToMany(mappedBy = "living")
    @JsonIgnore
    private List<Purchase> purchase;

}
