class MyArraySizeException extends Exception{
	 private static final long serialVersionUID = 1L;
	    private int number;
	    public int getNumber(){return number;}
	    public MyArraySizeException(String message){
	        super(message);
	    }
	}

