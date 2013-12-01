package open.example.firstExample;

import open.executors.ExecutorWrapper;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClientRequestDispatcher<T> {
    private List<T> _RequestQueue;
    private ExecutorWrapper _ExecutorWrapper;
    private List<Listener<T>> _Listeners;

    public ClientRequestDispatcher() {
        _RequestQueue = new CopyOnWriteArrayList<T>();
        _ExecutorWrapper = new ExecutorWrapper();
        _Listeners = new CopyOnWriteArrayList<Listener<T>>();
    }

    public void addSocket(final T clientRequest) throws IOException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                _RequestQueue.add(clientRequest);
                fireListeners(clientRequest);
            }
        };
        scheduleRunnableNow(runnable);
    }

    private void fireListeners(T clientRequest) {
        for (Listener listener : _Listeners) {
            listener.newRequestReceived(clientRequest);
        }

    }

    private void scheduleRunnableNow(Runnable runnable) {
        _ExecutorWrapper.scheduleNow(runnable);
    }

    public interface Listener<T> {
        public void newRequestReceived(T request);
    }
}
