package inventarioDIBRIX.domain;


import inventarioDIBRIX.domain.entities.Proveedor;
import inventarioDIBRIX.persistencia.RepositorioProveedor;


public interface IngresoProveedor {
    
    void ingresarProveedor(Proveedor proveedor, RepositorioProveedor repoProveedor);

   
    boolean verificarExistenciaProveedor(Proveedor proveedor, String codigo);

}
