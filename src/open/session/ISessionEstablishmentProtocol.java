package open.session;

import open.IRetryPolicy;

public interface ISessionEstablishmentProtocol {

    public boolean start();

    public boolean start(IRetryPolicy retryPolicy);

    public SessionEstablishState getState();
}
