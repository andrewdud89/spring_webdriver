package base.core.exception;

public class TestExecutionException extends AutomatronException {

    public TestExecutionException() {
    }

    public TestExecutionException(String message) {
        super(message);
    }

    public TestExecutionException(String message, Throwable cause) {
        super(message, cause);
    }

    public TestExecutionException(Throwable cause) {
        super(cause);
    }

    public TestExecutionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
