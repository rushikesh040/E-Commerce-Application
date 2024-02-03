package dao;

import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("https://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
