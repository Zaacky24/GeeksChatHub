package com.example.geekschathub.activities;

import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayOutputStream extends OutputStream {
    @Override
    public void write(int b) throws IOException {

    }

    public byte[] toByteArray() {
        return new byte[0];
    }

}
