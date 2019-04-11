package hu.ninetyone.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.Nullable;
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
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private Integer user;

    @Column
    @NotNull
    private Integer productId;

    @Column
    @NotNull
    private String productType;
/*
    @Column
    @NotNull
    private boolean isDelivered;*/

    @Column
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column
    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
