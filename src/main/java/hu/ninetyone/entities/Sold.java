package hu.ninetyone.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Sold implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /* USER THINGS */
    @Column(nullable = false)
    private Integer userId;

    /* PRODUCT THINGS */
    @Column(nullable = false)
    private Integer productId;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private Integer stockNumber;

    @Column(nullable = false)
    private String filters;

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

    @Column(nullable = false)
    private Integer price;

    /* SOLD THINGS */
    @Column(nullable = true)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(nullable = true)
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
