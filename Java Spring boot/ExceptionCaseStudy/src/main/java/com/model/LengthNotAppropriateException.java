package com.model;

public class LengthNotAppropriateException extends RuntimeException {
  
        
        private String message;
        
        
    	
    	public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public LengthNotAppropriateException(String message)
    	{
    		this.message=message;
    	}
    	
    	public String toString()
    	{
    		return "errror-->"+message;
    	}
    
}
