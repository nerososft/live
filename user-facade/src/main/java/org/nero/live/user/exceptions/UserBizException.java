package org.nero.live.user.exceptions;

/**
 * 会员逻辑层异常
 *
 * Created by nero on 16-8-30.
 */
public class UserBizException  extends BizException {
    public UserBizException(String message) {
        super(message);
    }

    public UserBizException(String message, Throwable cause) {
        super(message, cause);
    }
}
