// Importamos la clase Repositories
package com.apirest.apirest.Repositories;
// Importamos el Jpa Repositorie
import org.springframework.data.jpa.repository.JpaRepository;

// Importamos la clase Producto
import com.apirest.apirest.Entities.Producto;

// Creamos la interface ProductoRepository que extiende de JpaRepository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
