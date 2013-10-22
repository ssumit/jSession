package open.transport;

import open.session.contracts.IPacket;
import open.transport.TransportEvent;

public interface ITransportListener {

    public void fireEvent(TransportEvent event, IPacket packet);
}
