package open.session;

public interface IRequest {

    public IProtocolDescription getProtocolDescription();

    public String getRequestId();

    public IRetryPolicy getRetryPolicy();

    public void setRetryPolicy(IRetryPolicy retryPolicy);
}
