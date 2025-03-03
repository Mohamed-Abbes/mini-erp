package com.webproject.minierp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="suppliers")
@Data
@Builder
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required ")
    @NotNull
    private String name;

    @NotBlank(message = "Contact is required ")
    @NotNull(message = "Contact is required ")
    @Column(name = "contact_info")
    private String contactInfo;

    private String address;
}
