/**
 * 
 */
package com.idrivevs.io;

import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * @author Manukm
 *
 */
public class EvsFilterInputStream extends FilterInputStream {

	protected EvsFilterInputStream(InputStream in) {
		super(in);
	}
	
}
