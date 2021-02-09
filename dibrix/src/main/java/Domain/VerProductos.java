package Domain;

import Persistencia.RepositorioProducto;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c9bfc385-1a49-4837-ad25-6ffdf3128a55")
public interface VerProductos {
    @objid ("cf63a53a-e4f3-46d0-8f37-eb57b8980fc5")
    RepositorioProducto MostrarProductos();

}
