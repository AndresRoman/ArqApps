/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioDIBRIX.persistencia;

/**
 *
 * @author Andres Roman
 */
public interface IOperacionesDBProveedor {
    void ingresar();
    void getAllProveedores();
    void verificarExistenciaProveedor();
    
}
