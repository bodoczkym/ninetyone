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
public class Bedroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private Integer stocknumber;

    @Column(nullable = false)
    private String filters;

    private enum BedroomTypes {
        bed, bedstead, mattress, cabinet, cupboard, nightstand
    }

    private enum BedStead {
        wood, metal
    }

    private enum BedType {
        double_bed, king_bed, single_bed
    }

    private enum Mattress {
        memory, bonell, hybrid, cold_foam
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

    @OneToMany(mappedBy = "bed")
    @JsonIgnore
    private List<Purchase> purchase;
}
