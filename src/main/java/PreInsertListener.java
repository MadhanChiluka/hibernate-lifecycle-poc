import org.hibernate.event.spi.PreInsertEvent;
import org.hibernate.event.spi.PreInsertEventListener;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.PreUpdateEventListener;

public class PreInsertListener implements PreInsertEventListener,  
                                          PreUpdateEventListener 
{
    @Override
    public boolean onPreInsert(PreInsertEvent arg0) {
    	System.out.println("Pre Insert event...... " +arg0.getId());
        return false;
    }

    @Override
    public boolean onPreUpdate(PreUpdateEvent arg0) {
        System.out.println("Pre Update event......  " + arg0.getEntity());
        return false;
    }
}