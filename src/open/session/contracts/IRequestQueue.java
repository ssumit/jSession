package open.session.contracts;

import open.session.exceptions.RequestQueueOverFlow;

public interface IRequestQueue {

    public void addRequest(IRequest request) throws RequestQueueOverFlow;

    public IRequest getRequest();

    public void clear();
}
