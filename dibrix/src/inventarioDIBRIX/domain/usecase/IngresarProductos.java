package inventarioDIBRIX.domain.usecase;


import inventarioDIBRIX.domain.IngresoProductos;
import inventarioDIBRIX.domain.entities.Producto;
import inventarioDIBRIX.persistencia.IOperacionesDBProducto;


public class IngresarProductos implements IngresoProductos {
    
    private IOperacionesDBProducto repositorioProductos;
    
    public IngresarProductos (IOperacionesDBProducto repositorioProductos){
        this.repositorioProductos = repositorioProductos;
    }
    
     @Override
    public boolean verificarExistenciaProducto(String codigo) {
        return repositorioProductos.verificarExistenciaProductos(codigo);
    }
    
    @Override
    public int ingresarProductos(Producto producto) {
        Producto objPro = new Producto();
        int id = repositorioProductos.getAllProductos().size();
        if (!verificarExistenciaProducto(producto.getCodigo())) {
            inventarioDIBRIX.persistencia.Producto objProduc = new inventarioDIBRIX.persistencia.Producto();
            objProduc.setCodigo(producto.getCodigo());
            objProduc.setNombre(producto.getNombre());
            objProduc.setTipo(producto.getTipo());
            objProduc.setCantidad(producto.getCantidad());
            objProduc.setId(id+1);
            
            repositorioProductos.ingresar(objProduc);
            
            return 1;
        }
        return -1;
    }

   

   
  
    

}
