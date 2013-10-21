package open.session;

import open.session.contracts.IRetryPolicy;

public interface ISessionEstablishmentProtocol {

    public boolean start();

    public boolean start(IRetryPolicy retryPolicy);

    public SessionEstablishState getState();
}
