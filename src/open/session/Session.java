package open.session;

import open.session.contracts.ISession;
import open.session.contracts.ISessionClient;
import open.session.persistence.ICacheEntry;

public class Session implements ISession, ICacheEntry{
    @Override
    public void isValid() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addClient(ISessionClient sessionClient) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object getAttribute(String attributeKey) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SessionState getState() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void invalidate() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeAttribute(String attributeKey) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeClient(ISessionClient sessionClient) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAttribute(String attributeKey, Object attribute) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
