package com.idrivevs.listner;

public interface ProgressListener {
	void setTransferredBytes(long bytes);
	float progress();
	
}
