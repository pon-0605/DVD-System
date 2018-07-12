package db;

import entity.Taikai;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VideoDb {
    
    @PersistenceContext
    private EntityManager em;
    
    public void create() {
        em.persist();
    }
    
    public void update() {
        em.merge();
    }
    
    public void delete(Taikai taikai) {
        em.remove(em.merge(taikai));
    }
    
    public List<Taikai> getAll() {
        return em.createQuery("null").getResultList();
    }
}
