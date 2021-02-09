package inventarioDIBRIX.domain;

import inventarioDIBRIX.domain.entities.Producto;




public interface IngresoProductos {
    
    public int ingresarProductos(Producto producto);

   
    boolean verificarExistenciaProducto(String codigo);

}
