package open.persistence;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleCache<KEY> implements ICache<KEY> {

    private final Map<KEY, ICacheEntry> _store;

    public SimpleCache() {
        _store = new ConcurrentHashMap<KEY, ICacheEntry>();
    }

    @Override
    public void put(KEY key, ICacheEntry value) {
        _store.put(key, value);
    }

    @Override
    public ICacheEntry get(KEY key) {
        return _store.get(key);
    }

    @Override
    public void invalidate(KEY key) {
        _store.remove(key);
    }

    @Override
    public void clear() {
        _store.clear();
    }
}
