package org.nero.live.user.exceptions;

/**
 * Created by nero on 16-8-30.
 */
public class UserBizException  extends RuntimeException {
    public UserBizException(String message) {
        super(message);
    }

    public UserBizException(String message, Throwable cause) {
        super(message, cause);
    }
}
