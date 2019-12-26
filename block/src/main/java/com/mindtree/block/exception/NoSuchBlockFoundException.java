package com.mindtree.block.exception;

public class NoSuchBlockFoundException extends ServiceException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSuchBlockFoundException() {
		super();
		
	}

	public NoSuchBlockFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public NoSuchBlockFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public NoSuchBlockFoundException(String arg0) {
		super(arg0);
		
	}

	public NoSuchBlockFoundException(Throwable arg0) {
		super(arg0);
		
	}

}
