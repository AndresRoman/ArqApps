package inventarioDIBRIX.domain;


import inventarioDIBRIX.domain.entities.Producto;
import inventarioDIBRIX.persistencia.RepositorioProducto;
import java.util.ArrayList;


public interface VerProductos {
    
    ArrayList<Producto> mostrarProductos(RepositorioProducto repoProducto);

   
}
