package com.furyjoker.prios.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseCode {
    SUCCESS("요청이 성공적으로 처리되었습니다.");

    private final String message;
}
