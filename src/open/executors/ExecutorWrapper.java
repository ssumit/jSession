package open.executors;

import java.util.concurrent.*;

public class ExecutorWrapper {
    private ScheduledExecutorService _ExecutorService;

    public ExecutorWrapper() {
        _ExecutorService = Executors.newSingleThreadScheduledExecutor();
    }

    public void setExecutorService(ThreadFactory threadFactory, int NoOfThreads)
    {
        if(NoOfThreads == 1)
        {
            _ExecutorService = Executors.newSingleThreadScheduledExecutor(threadFactory);
        }
        else
        {
            _ExecutorService = Executors.newScheduledThreadPool(NoOfThreads, threadFactory);
        }
    }

    public ScheduledFuture<?> scheduleNow(Runnable runnable)
    {
        return schedule(runnable,0, TimeUnit.SECONDS);
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long time, TimeUnit timeUnit)
    {
        CustomFutureTask task = new CustomFutureTask(runnable);
        return _ExecutorService.schedule(task, time, timeUnit);
    }
}
