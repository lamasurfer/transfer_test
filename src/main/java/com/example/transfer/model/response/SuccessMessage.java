package com.example.transfer.model.response;

import java.util.Objects;

public class SuccessMessage {
    private String operationId;

    public SuccessMessage() {
    }

    public SuccessMessage(String operationId) {
        this.operationId = operationId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuccessMessage that = (SuccessMessage) o;
        return Objects.equals(operationId, that.operationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId);
    }

    @Override
    public String toString() {
        return "SuccessMessage{" +
                "operationId='" + operationId + '\'' +
                '}';
    }
}
