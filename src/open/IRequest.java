package open;

public interface IRequest {

    public void cancel();

    public RequestPriority getPriority();

    public IProtocolDescription getProtocolDescription();

    public String getRequestId();

    public IRetryPolicy getRetryPolicy();

    public RequestStatus getStatus();

    public void setProtocolDescription(IProtocolDescription protocolDescription);

    public void setRetryPolicy(IRetryPolicy retryPolicy);

    public void setPriority(RequestPriority priority);
}
