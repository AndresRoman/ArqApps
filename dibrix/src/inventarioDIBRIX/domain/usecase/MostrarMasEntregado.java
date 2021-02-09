
package inventarioDIBRIX.domain.usecase;

import inventarioDIBRIX.domain.VerMasEntregado;
import inventarioDIBRIX.domain.entities.Producto;
import inventarioDIBRIX.persistencia.RepositorioProducto;

/**
 *
 * @author Andres Roman
 */
public class MostrarMasEntregado implements VerMasEntregado{

    @Override
    public Producto mostrarMasEntregado(RepositorioProducto repoProducto) {
        return new Producto();
    }
    
}
