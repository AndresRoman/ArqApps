package Domain;

import Domain.Entities.Producto;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("21024ffd-d285-4e01-9a4f-bb30052d9e25")
public interface BusquedaProductos {
    @objid ("35e9537e-083c-4c9d-881a-0a88efd535c1")
    Producto BuscarP(String codigo);

}
