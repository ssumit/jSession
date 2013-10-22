package open.example;

import open.session.SessionManager;
import open.session.contracts.ISession;
import open.session.contracts.ISessionManager;
import open.persistence.ICache;
import open.persistence.SimpleCache;

public class SimpleClientHttpExample {

    public static void main(String[] args) {
        //client mode :
        // start SESSION
        //make request to SESSION
        int SESSION_ONE = 1;
        int SESSION_TWO = 2;
        ICache<Integer> cache = new SimpleCache();
        ISessionManager<Integer> sessionManager = new SessionManager<Integer>(cache);
        ISession firstSession = sessionManager.openSession(SESSION_ONE);
        ISession secondSession = sessionManager.openSession(SESSION_TWO);
    }
}
