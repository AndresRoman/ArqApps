package inventarioDIBRIX.adaptadores;


import inventarioDIBRIX.persistencia.RepositorioProducto;
import inventarioDIBRIX.domain.IngresoProductos;
import inventarioDIBRIX.domain.entities.Producto;
import inventarioDIBRIX.persistencia.IOperacionesDBProducto;


public class IngresarProductoPortInt {
   
    public RepositorioProducto repositorioProducto;
    
    private IngresoProductos ingresoProductos;
    
    private IOperacionesDBProducto ioperacionesDBProducto;
  
    public IngresarProductoPortInt(IngresoProductos ingresoProductos, IOperacionesDBProducto ioperacionesDBProducto) {
        this.ingresoProductos = ingresoProductos;
        this.ioperacionesDBProducto = ioperacionesDBProducto;
    }
    
    public int ingresarProductos(Producto producto){
        return this.ingresoProductos.ingresarProductos(producto);
    }
    
}
