package inventarioDIBRIX.domain;


import inventarioDIBRIX.domain.entities.Producto;


public interface BuscarProductos {
  
    Producto buscarProducto(String codigo);

}
