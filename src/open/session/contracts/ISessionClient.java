package open.session.contracts;

import open.session.SessionEvent;

public interface ISessionClient {

    public boolean hasUnreadData(SessionEvent sessionEvent);

    public byte[] read(SessionEvent sessionEvent);

    public void write(SessionEvent sessionEvent, Object object);

}
