package open.session.persistence;

public abstract class ICacheEntry {
    private long _ttl;

    public abstract void isValid();
}
