package org.nero.live.core.exceptions;

/**
 * Created by nero on 16-8-31.
 */
public class BizException extends RuntimeException {

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(String message) {
        super(message);
    }
}
