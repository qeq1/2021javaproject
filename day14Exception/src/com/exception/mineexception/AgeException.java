package com.exception.mineexception;

import java.io.FileNotFoundException;

public class AgeException extends FileNotFoundException {

    public AgeException(String s) {
        super(s);
    }

    public AgeException() {
    }
}
