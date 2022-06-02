package com.example.minio.s3.exception;

public class PutFileException extends RuntimeException {
    public PutFileException(String msg) {
        super(msg);
    }
}
