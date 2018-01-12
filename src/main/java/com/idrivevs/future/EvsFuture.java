/**
 * 
 */
package com.idrivevs.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.idrivevs.exception.EvsClientException;
import com.idrivevs.exception.EvsServiceException;
import com.idrivevs.listner.ProgressListener;

/**
 * @author Manukm
 *
 */
public class EvsFuture<V> implements Future<V> {
	
	
	private Future<V> future;
	private ProgressListener listener;
	/**
	 * 
	 */
	public EvsFuture(Future<V> future, ProgressListener listener) {
		this.future = future;
		this.listener = listener;
	}

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		// TODO Auto-generated method stub
		return future.cancel(mayInterruptIfRunning);
	}

	@Override
	public V get() throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		return future.get();
	}

	@Override
	public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		return future.get(timeout, unit);
	}

	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return future.isCancelled();
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return future.isDone();
	}
	
	/**
	 * 
	 * @return
	 * @throws EvsClientException
	 * @throws EvsServiceException
	 */
	public V getResponse() throws EvsServiceException{
		try {
			return get();
		} catch (InterruptedException e) {
			throw new EvsServiceException(e.getMessage(), e);
		} catch (ExecutionException e) {
			throw new EvsServiceException(e.getMessage(), e);
		}
	}
	
	/**
	 * 
	 * @throws EvsClientException
	 * @throws EvsServiceException
	 */
	public void waitForCompletion()throws EvsServiceException{
		try {
			get();
		} catch (InterruptedException e) {
			throw new EvsServiceException(e.getMessage(), e);
		} catch (ExecutionException e) {
			throw new EvsServiceException(e.getMessage(), e);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public float getProgress(){
		return this.listener.progress();
	}
	
	

}
