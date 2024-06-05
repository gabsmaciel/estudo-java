package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {

    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Leonardo Alterado");
        usuario.setEmail("leonardo@lanche.com.br");


        /// em.merge(usuario);
        /// mesmo sem uso do Merge é possível enviar os dados ao banco tendo em vista que está em estado gerenciado.

        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
