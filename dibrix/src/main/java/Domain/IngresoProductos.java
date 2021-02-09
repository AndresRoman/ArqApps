package Domain;

import Domain.Entities.Producto;
import Persistencia.RepositorioProducto;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2a084b67-23b8-436f-884a-465d0c6ae1b5")
public interface IngresoProductos {
    @objid ("e436781c-d44f-486f-8425-8a602db30de7")
    void IngresarProducto(Producto producto, RepositorioProducto repoProducto);

    @objid ("8e8a42c5-ff0a-40d8-89bf-90e2e689c8f4")
    boolean VerificarExistenciaProducto(Producto producto, String codigo);

}
