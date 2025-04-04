package com.furyjoker.prios.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiResponse<T> {
    private boolean success;
    private T data;
    private String message;

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(true, data, ResponseCode.SUCCESS.getMessage());
    }

    public static ApiResponse<Void> success() {
        return new ApiResponse<>(true, null, ResponseCode.SUCCESS.getMessage());
    }

    public static ApiResponse<Void> fail(String message) {
        return new ApiResponse<>(false, null, message);
    }
}
