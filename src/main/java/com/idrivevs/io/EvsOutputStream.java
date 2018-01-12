package com.idrivevs.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.idrivevs.listner.ProgressListener;

public class EvsOutputStream extends FilterOutputStream{

	private ProgressListener listener;
    private long transferred;
    
    
    public EvsOutputStream(
      OutputStream out, ProgressListener listener) {
        super(out);
        this.listener = listener;
        transferred = 0;
    }
 
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        out.write(b, off, len);
        transferred += len;
        listener.setTransferredBytes(getCurrentProgress());
    }
 
    @Override
    public void write(int b) throws IOException {
        out.write(b);
        transferred++;
        listener.setTransferredBytes(getCurrentProgress());
    }
 
    private long getCurrentProgress() {
        return transferred ;
    }

}


