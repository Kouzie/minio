package com.example.minio.s3;

import com.example.minio.s3.exception.PutFileException;
import com.example.minio.s3.exception.RemoveFileException;

import java.io.InputStream;

public interface FileAdaptor {
    String putFile(String path, InputStream inputStream, String contentType) throws PutFileException;

    Boolean removeFile(String path) throws RemoveFileException;
}
