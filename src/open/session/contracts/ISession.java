package open.session.contracts;

import open.session.SessionState;

public interface ISession {

    public void addClient(IClient client);

    public Object getAttribute(String attributeKey);

    public SessionState getState();

    public void invalidate();

    public void removeAttribute(String attributeKey);

    public void removeClient(IClient client);

    public void setAttribute(String attributeKey, Object attribute);

}
