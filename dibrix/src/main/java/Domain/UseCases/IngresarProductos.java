package Domain.UseCases;

import Domain.Entities.Producto;
import Domain.IngresoProductos;
import Persistencia.RepositorioProducto;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1380e35e-bd0b-4dd8-990c-2fe14cad8fe2")
public class IngresarProductos implements IngresoProductos {
    @objid ("0521fffa-7592-42d7-9c03-b8ec5ba494b4")
    public void IngresarProducto(Producto producto, RepositorioProducto repoProducto) {
    }

    @objid ("219d95bd-8cb5-44f9-b378-77ba73f112d3")
    public boolean VerificarExistenciaProducto(Producto producto, String codigo) {
    }

}
