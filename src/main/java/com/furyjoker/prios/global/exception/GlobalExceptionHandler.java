package com.furyjoker.prios.global.exception;

import com.furyjoker.prios.global.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PriosException.class)
    public ResponseEntity<ApiResponse<Void>> handlePriosException(PriosException ex) {
        return ResponseEntity
                .status(ex.getErrorCode().getHttpStatus())
                .body(ApiResponse.fail(ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Void>> handleException(Exception ex) {
        return ResponseEntity
                .status(500)
                .body(ApiResponse.fail("예상치 못한 서버 오류가 발생했습니다."));
    }
}
