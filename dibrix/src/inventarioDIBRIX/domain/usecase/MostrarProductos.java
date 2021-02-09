/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioDIBRIX.domain.usecase;

import inventarioDIBRIX.domain.VerProductos;
import inventarioDIBRIX.domain.entities.Producto;
import inventarioDIBRIX.persistencia.RepositorioProducto;
import java.util.ArrayList;

/**
 *
 * @author Andres Roman
 */
public class MostrarProductos implements VerProductos{

    @Override
    public ArrayList<Producto> mostrarProductos(RepositorioProducto repoProducto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
