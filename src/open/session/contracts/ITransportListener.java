package open.session.contracts;

import open.session.TransportEvent;

public interface ITransportListener {

    public void fireEvent(TransportEvent event, IPacket packet);
}
