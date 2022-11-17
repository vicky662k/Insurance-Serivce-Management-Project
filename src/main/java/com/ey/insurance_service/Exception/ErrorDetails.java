package com.ey.insurance_service.Exception;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.Date;
@Data
@NoArgsConstructor
public class ErrorDetails {

    private String errormsg;
    private Date timestamp;
    private HttpStatus errcode;

    public ErrorDetails(String errormsg, Date timestamp, HttpStatus errcode) {
        this.errormsg = errormsg;
        this.timestamp = timestamp;
        this.errcode = errcode;
    }
}
