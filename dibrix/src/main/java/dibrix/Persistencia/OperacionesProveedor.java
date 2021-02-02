package dibrix.Persistencia;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d3f31db6-32aa-40b9-a194-94ea34c9ec11")
public interface OperacionesProveedor {
    @objid ("6369ed62-4b23-4e3e-b266-a290c0c892d0")
    void Ingresar();

    @objid ("7f0c806a-afb0-40f9-84b2-fe73ab88a8e7")
    void Get();

    @objid ("32b0436b-5d6e-4b5f-985b-b265aa3af590")
    void VerificarExistencia();

}
