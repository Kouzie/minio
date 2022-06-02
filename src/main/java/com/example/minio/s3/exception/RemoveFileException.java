package com.example.minio.s3.exception;

public class RemoveFileException extends RuntimeException {
    public RemoveFileException(String message) {
        super(message);
    }
}
