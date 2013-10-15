package open.session;

public interface ITransport {

    public void addListener(ITransportListener listener);

    public void removeListener(ITransportListener listener);
}
