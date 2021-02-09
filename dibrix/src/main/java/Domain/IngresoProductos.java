package inventarioDIBRIX.domain;


import inventarioDIBRIX.domain.entities.Producto;
import inventarioDIBRIX.persistencia.RepositorioProducto;


public interface IngresoProductos {
    
    void ingresarProductos(Producto producto, RepositorioProducto repoProducto);

   
    boolean verificarExistenciaProducto(Producto producto, String codigo);

}
