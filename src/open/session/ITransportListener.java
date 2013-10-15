package open.session;

public interface ITransportListener {

    public void fireEvent(TransportEvent event, IPacket packet);
}
