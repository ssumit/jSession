package open.executors;

import java.util.concurrent.ThreadFactory;

public class ThreadFactoryCreator
{
    public ThreadFactory get(final String threadName)
    {
        return new ThreadFactory()
        {
            private int count = 0;

            @Override
            public Thread newThread(Runnable runnable)
            {
                count++;
                return new Thread(runnable, threadName + "-" + count);
            }
        };
    }
}
