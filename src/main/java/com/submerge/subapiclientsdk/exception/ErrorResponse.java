package com.submerge.subapiclientsdk.exception;

import lombok.Data;

/**
 * @Author: Submerge
 * @Date: 2023年09月18日 21:52
 * @Version: 1.0
 * @Description:
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
