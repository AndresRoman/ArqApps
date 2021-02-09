package Domain;

import Domain.Entities.Producto;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7ca1a9b1-198d-44d2-90ac-e3ebd6dce143")
public interface VerMasEntregado {
    @objid ("8a52060e-7f71-4c4f-9674-61f811d4f022")
    Producto MostrarMasEntregado();

}
