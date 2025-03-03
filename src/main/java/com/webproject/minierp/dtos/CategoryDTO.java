package com.webproject.minierp.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)   //Used during serialization to exclude null fields from the JSON output
@JsonIgnoreProperties(ignoreUnknown = true) //Used during deserialization to ignore unknown properties in the JSON input
public class CategoryDTO {

    private Long id;

    @NotBlank(message = "Name is required ")
    @NotNull
    private String name;

    private List<ProductDTO> products;


}
