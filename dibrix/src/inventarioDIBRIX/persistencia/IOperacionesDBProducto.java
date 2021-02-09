/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioDIBRIX.persistencia;

import java.util.List;

/**
 *
 * @author Andres Roman
 */
public interface IOperacionesDBProducto {
    public int ingresar(Producto producto);
    public List<Producto> getAllProductos();
    public boolean verificarExistenciaProductos(String codigo);
    
}
