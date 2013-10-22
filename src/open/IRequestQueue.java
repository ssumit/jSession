package open;

public interface IRequestQueue {

    public void addRequest(IRequest request) throws RequestQueueOverFlow;

    public IRequest getRequest();

    public void clear();
}
