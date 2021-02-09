package Persistencia;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ce0c64e1-0af7-4ecc-9cd2-213011d285ee")
public interface OperacionesProducto {
    @objid ("52c3b5f0-b7fd-4963-84c0-4c9ee23c666c")
    void Ingresar();

    @objid ("542c1bb5-0afb-47b9-be62-1a58d6441996")
    void Get();

    @objid ("b697d15a-c59e-4780-b2d0-800fe8ab632c")
    void VerificarExistencia();

}
