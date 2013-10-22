package open.session;

import open.session.contracts.ISession;
import open.session.contracts.ISessionManager;
import open.persistence.ICache;

public class SessionManager<KEY> implements ISessionManager<KEY> {
    private ICache<KEY> _cache;

    public SessionManager(ICache<KEY> _cache) {
        this._cache = _cache;
    }

    @Override
    public void closeSession(KEY key) {
        _cache.invalidate(key);
    }

    @Override
    public ISession getSession(KEY key) {
        return (ISession) _cache.get(key);
    }

    @Override
    public ISession openSession(KEY key) {
        Session session = new Session();
        _cache.put(key, session);
        return session;
    }

    @Override
    public ISession openSession(KEY key, ISessionEstablishmentProtocol sessionEstablishmentProtocol) {
        return openSession(key);
    }
}
