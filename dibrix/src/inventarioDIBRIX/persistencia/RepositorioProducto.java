/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarioDIBRIX.persistencia;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Andres Roman
 */
public class RepositorioProducto implements IOperacionesDBProducto{
    

    @Override
    public int ingresar(Producto productoInsercion) {
        try {
            ProductoJpaController jpaObj = new ProductoJpaController(Persistence.createEntityManagerFactory("InventarioDIBRIXPU"));
            jpaObj.create(productoInsercion);
        } catch (Exception e) {
            Logger.getLogger(RepositorioProducto.class.getName()).log(Level.SEVERE, null, e);
        }
        return productoInsercion.getId();
    }

    @Override
    public List<Producto> getAllProductos() {
        EntityManager em = Persistence.createEntityManagerFactory("InventarioDIBRIXPU").createEntityManager();
        TypedQuery<Producto> query = em.createNamedQuery("Producto.findAll", Producto.class);
        return query.getResultList();
    }

    @Override
    public boolean verificarExistenciaProductos(String codigo) {
        List<Producto> objPro = getAllProductos();
        for (int i = 0; i < objPro.size(); i++) {
            if (objPro.get(i).getCodigo().compareTo(codigo) == 0) {
                return true;
            }
        }
        return false;
    }

   

    
    
}
