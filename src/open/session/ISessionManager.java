package open.session;

public interface ISessionManager {

    public void closeSession(Key key);

    public ISession getSession(Key key);

    public ISession openSession(Key key);

}
