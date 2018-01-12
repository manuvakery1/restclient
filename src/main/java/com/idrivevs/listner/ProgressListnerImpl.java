package com.idrivevs.listner;

public class ProgressListnerImpl implements ProgressListener {
	
	private long transferredBytes;
	private long totalBytes;
	
	public ProgressListnerImpl(long totalBytes) {
		this.transferredBytes = 0;
		this.totalBytes = totalBytes;
	}
	

	@Override
	public void setTransferredBytes(long bytes) {
		this.transferredBytes = bytes;
		
	}

	@Override
	public float progress() {
		// TODO Auto-generated method stub
		return ((float) transferredBytes / totalBytes) * 100;
	}

	

}
