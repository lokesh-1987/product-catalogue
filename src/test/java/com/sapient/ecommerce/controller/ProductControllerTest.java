package com.sapient.ecommerce.controller;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import com.sapient.ecommerce.entity.Product;
import com.sapient.ecommerce.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    public void findAll() throws Exception {
        Product product = new Product();
        product.setId(1);
        product.setName("Stock 1");
        product.setQuantity(1);
        product.setSize("M");

        List<Product> products = Arrays.asList(product);
        given(productService.getProducts("size", "M")).willReturn(products);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/products/filter/size/M"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1,'name': 'Stock 1';'quantity': 1;'size': M}]"));
    }
}
