package coding.capunpon.rest;

import java.io.Serializable;

public class SolutionResponse implements Serializable {
    private String error;
    private Object result;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
