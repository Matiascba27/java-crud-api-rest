
// Importamos la clase Controllers
package com.apirest.apirest.Controllers;

// Importamos las librerias necesarias
import java.util.List;
// Importamos las librerias necesarias para Spring Boot
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Importamos la clase Producto
import com.apirest.apirest.Entities.Producto;
import com.apirest.apirest.Repositories.ProductoRepository;

// Indica que esta clase es un controlador de REST
@RestController

// Creamos la ruta para el controlador
@RequestMapping("/productos")

// Creamos la clase ProductoController
public class ProductoController {

    // Inyecta una instancia de ProductoRepository en la clase
    @Autowired
    private ProductoRepository productoRepository;

    // Indica que el método siguiente devuelve una respuesta para una solicitud GET
    @GetMapping
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }
    
    // Indica que el metodo siguiente devuelve una respuesta para una solicitud GET si no encuentra el producto
    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Long id) {
        return productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto con el ID: " + id));
    }

    // Indica que el metodo siguiente devuelve una respuesta para una solicitud POST
    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    // Indica que el metodo siguiente devuelve una respuesta para una solicitud PUT
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto detallesProducto) {
        Producto producto = productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto con el ID: " + id));

        producto.setNombre(detallesProducto.getNombre());
        producto.setPrecio(detallesProducto.getPrecio());

        return productoRepository.save(producto);
    }

    // Indica que el metodo siguiente devuelve una respuesta para una solicitud DELETE
    @DeleteMapping("/{id}")
    public String deleteProducto(@PathVariable Long id) {
        Producto producto = productoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontro el producto con el ID: " + id));

        productoRepository.delete(producto);
        return "El producto con el ID: " + id + " fue eliminado correctamente";
    }
}
