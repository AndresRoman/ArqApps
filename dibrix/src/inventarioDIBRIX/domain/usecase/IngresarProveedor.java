package inventarioDIBRIX.domain.usecase;


import inventarioDIBRIX.domain.entities.Proveedor;
import inventarioDIBRIX.persistencia.RepositorioProveedor;
import inventarioDIBRIX.domain.IngresoProveedor;


public class IngresarProveedor implements IngresoProveedor {
  
    @Override
    public void ingresarProveedor(Proveedor proveedor, RepositorioProveedor repoProducto) {
    }

    @Override
    public boolean verificarExistenciaProveedor(Proveedor proveedor, String codigo) {
        return false;
    }
}
