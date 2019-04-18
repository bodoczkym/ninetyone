package hu.ninetyone.entities.Products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hu.ninetyone.entities.Category;
import hu.ninetyone.entities.Feedback;
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
    private String filters;

    private enum TableType {
        wood, metal, plastic
    }

    private enum SittingTypes {
        wood, textil
    }

    @Column(nullable = true)
    private String description;

    @Column(nullable = true)
    private Integer voters;

    @Column(nullable = true)
    private Integer rate;


    @Column(nullable = false)
    private String type;

    @Column(nullable = true)
    private String img;

    @Column
    @NotNull
    private Integer price;

    @Column(nullable = true)
    private Integer quantity;

    @Column(nullable = true)
    private Integer inCart;

    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Category category;

    @OneToMany(mappedBy = "livingroom")
    @JsonIgnore
    private List<Feedback> feedback;

}
