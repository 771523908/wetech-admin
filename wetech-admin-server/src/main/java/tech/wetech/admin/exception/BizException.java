package tech.wetech.admin.exception;

import tech.wetech.admin.model.ResultStatus;

public class BizException extends RuntimeException {

    ResultStatus status;

    public BizException(ResultStatus status) {
        //不生成栈追踪信息
        super(status.getMsg(), null, false, false);
        this.status = status;
    }

    public BizException(ResultStatus status, String message) {
        super(message);
        this.status = status;
    }

    public ResultStatus getStatus() {
        return status;
    }

    public void setStatus(ResultStatus status) {
        this.status = status;
    }


}
