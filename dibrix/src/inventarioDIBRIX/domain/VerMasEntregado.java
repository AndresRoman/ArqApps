package inventarioDIBRIX.domain;


import inventarioDIBRIX.domain.entities.Producto;
import inventarioDIBRIX.persistencia.RepositorioProducto;


public interface VerMasEntregado {
    
    Producto mostrarMasEntregado(RepositorioProducto repoProducto);

   
}
