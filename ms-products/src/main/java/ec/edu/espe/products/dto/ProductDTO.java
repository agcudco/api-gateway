package ec.edu.espe.products.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private Integer stock;
    private Long categoryId;
}
