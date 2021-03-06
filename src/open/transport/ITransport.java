package open.transport;

public interface ITransport {

    public void addListener(ITransportListener listener);

    public ITransportResponse executeRequest(ITransportRequest request);

    public void removeListener(ITransportListener listener);
}
