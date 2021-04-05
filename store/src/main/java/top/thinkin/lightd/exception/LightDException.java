package top.thinkin.lightd.exception;

import org.apache.logging.log4j.core.util.Throwables;

public class LightDException extends Exception {
    private static final long serialVersionUID = 1L;
    private final ErrorType type;

    public LightDException(ErrorType type, String errmsg) {
        super(String.join(" ", type.name(),errmsg));
        this.type = type;
    }


    public LightDException(ErrorType type, String errmsg, Exception cause) {
        super(String.join(" ", type.name(), errmsg), Throwables.getRootCause(cause));
        this.type = type;
    }

    public LightDException(ErrorType type, Exception cause) {
        super(type.name(), Throwables.getRootCause(cause));
        this.type = type;
    }


    public ErrorType getType() {
        return type;
    }
}
