package cn.xzxy.lewy.circleachieve.pojo;

public class LogInterfaceWithBLOBs extends LogInterface {
    private String inParam;

    private String outParam;

    public String getInParam() {
        return inParam;
    }

    public void setInParam(String inParam) {
        this.inParam = inParam == null ? null : inParam.trim();
    }

    public String getOutParam() {
        return outParam;
    }

    public void setOutParam(String outParam) {
        this.outParam = outParam == null ? null : outParam.trim();
    }
}