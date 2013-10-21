package open.session.contracts;

import open.session.ISessionEstablishmentProtocol;

public interface ISessionManager<KEY> {

    public void closeSession(KEY key);

    public ISession getSession(KEY key);

    //requires all required data/protocol to establish session: like handshaking protocol to establish credentials
    //question: does choice of protocol requires to fix the transport now??
    public ISession openSession(KEY key);

    public ISession openSession(KEY key, ISessionEstablishmentProtocol sessionEstablishmentProtocol);
}
