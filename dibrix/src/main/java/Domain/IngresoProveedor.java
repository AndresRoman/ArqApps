package Domain;

import Domain.Entities.Proveedor;
import Persistencia.RepositorioProveedor;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("067c3d39-749d-49e0-95c2-80789645e501")
public interface IngresoProveedor {
    @objid ("bc208677-beb7-4568-9870-e187ffab1840")
    void IngresarProvedor(Proveedor proveedor, RepositorioProveedor repoProveedor);

    @objid ("f26a611a-9bbd-430c-8020-dfee5f8f5789")
    void VerificarExistenciaProveedor(Proveedor proveedor, String codigo);

}
