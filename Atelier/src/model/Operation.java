package model;

public class Operation {
	
	private String lblOperation;

	public Operation(){
		this.lblOperation = null;
	}
	
	/**
	 * 
	 * @param pLblOperation
	 */
	public Operation(String pLblOperation) {
		this.lblOperation=pLblOperation;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getLblOperation()
	{
		return lblOperation;
	}
	
	/**
	 * 
	 * @param pLblOperation
	 */
	public void setLblOperation(String pLblOperation)
	{
		this.lblOperation=pLblOperation;
	}

}
