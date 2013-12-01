package open.session.contracts;

import open.session.ISessionEstablishmentProtocol;

public interface ISessionManager<KEY> {

    public void closeSession(KEY key);

    public ISession getSession(KEY key);

    public ISession openSession(KEY key);

    public ISession openSession(KEY key, ISessionEstablishmentProtocol sessionEstablishmentProtocol);
}
