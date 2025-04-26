package com.SpringBoot_ThaiNguyenBaoLuan.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
