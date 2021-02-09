package Domain;

import Domain.Entities.Proveedor;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("acacfd9f-b536-49d7-9096-45dac696dda4")
public interface BusquedaProveedor {
    @objid ("37ea3e98-6508-41eb-9f78-292be1db862b")
    Proveedor BuscarProveedor(String codigo);

}
