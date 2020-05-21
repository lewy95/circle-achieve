package cn.xzxy.lewy.circleachieve.pojo;

import java.util.Date;

public class LogInterface {
    private String logId;

    private String invokeClass;

    private String invokeMethod;

    private String invokeName;

    private String invokeState;

    private String clientIpaddr;

    private Date createTime;

    private Date endTime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getInvokeClass() {
        return invokeClass;
    }

    public void setInvokeClass(String invokeClass) {
        this.invokeClass = invokeClass == null ? null : invokeClass.trim();
    }

    public String getInvokeMethod() {
        return invokeMethod;
    }

    public void setInvokeMethod(String invokeMethod) {
        this.invokeMethod = invokeMethod == null ? null : invokeMethod.trim();
    }

    public String getInvokeName() {
        return invokeName;
    }

    public void setInvokeName(String invokeName) {
        this.invokeName = invokeName == null ? null : invokeName.trim();
    }

    public String getInvokeState() {
        return invokeState;
    }

    public void setInvokeState(String invokeState) {
        this.invokeState = invokeState == null ? null : invokeState.trim();
    }

    public String getClientIpaddr() {
        return clientIpaddr;
    }

    public void setClientIpaddr(String clientIpaddr) {
        this.clientIpaddr = clientIpaddr == null ? null : clientIpaddr.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}