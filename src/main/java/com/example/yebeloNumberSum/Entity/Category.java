package com.example.yebeloNumberSum.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "category")
public class Category {

    @Id
    private String categoryCode;

    @Column(name = "number", nullable = false)
    private Long number;

    @Column(name = "users_accessing", nullable = false)
    private Integer usersAccessing;
}
