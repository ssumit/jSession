package open.session;

public interface IClient {

    public boolean hasUnreadData(SessionEvent sessionEvent);

    public byte[] read(SessionEvent sessionEvent);

    public void write(SessionEvent sessionEvent, Object object);

}
