package eu.fp7.scase.launcher.cimgenerator.handlers;

import java.util.concurrent.ExecutionException;

public class CanceledExecutionException extends ExecutionException{

	public CanceledExecutionException() {
		super();
	}
	
	public CanceledExecutionException(String string) {
		super(string);
	}
	
	public CanceledExecutionException(Throwable cause) {
		super(cause);
	}
	
	public CanceledExecutionException(String string, Throwable cause) {
		super(string, cause);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}