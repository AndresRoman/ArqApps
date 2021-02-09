package Domain.UseCases;

import Domain.Entities.Proveedor;
import Domain.IngresoProveedor;
import Persistencia.RepositorioProveedor;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d345dac4-5fd9-4359-8a00-6ea900a52489")
public class IngresarProveedor implements IngresoProveedor {
    @objid ("0ca9c25a-e49f-4a2d-be97-5ef26bd46589")
    public void IngresarProvedor(Proveedor proveedor, RepositorioProveedor repoProveedor) {
    }

    @objid ("9f01b52d-b501-4da8-8f1b-e10547cca823")
    public void VerificarExistenciaProveedor(Proveedor proveedor, String codigo) {
    }

}
