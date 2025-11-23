package com.mapstruct.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultMessage {

    private String status;
    private String code = "200";
    private String message;
    private Object data;

    public ResultMessage() {
    }

    public ResultMessage(String status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public ResultMessage(String status, String code, String message, Object data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
