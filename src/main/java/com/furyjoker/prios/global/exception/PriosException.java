package com.furyjoker.prios.global.exception;

import lombok.Getter;

@Getter
public class PriosException extends RuntimeException {
    private final ErrorCode errorCode;

    public PriosException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
