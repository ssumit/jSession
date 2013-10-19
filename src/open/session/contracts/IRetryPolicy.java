package open.session.contracts;

import java.util.concurrent.TimeUnit;

public interface IRetryPolicy {

    public long getNextRetrialTime(TimeUnit timeUnit);

    public boolean isRetrialAttemptPending();

}
