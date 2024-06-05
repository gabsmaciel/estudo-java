package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

       String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql,Usuario.class);

        ///usa o set para consultar no max no exemplo abaixo 5 resultados

        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();

        for(Usuario usuario: usuarios) {
            System.out.println("ID: " + usuario.getId() + " Email: " + usuario.getEmail());
        }


        em.close();
        emf.close();
    }
}
