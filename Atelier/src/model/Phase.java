package model;

public class Phase {
	
	private int phaseNumber;
	private Operation operationType;
	

	public Phase(){
		this.phaseNumber = 0;
		this.operationType = null;
		
	}
	/**
	 * 
	 * @param pPhaseNumber
	 * @param pOperationType
	 */
	public Phase(int pPhaseNumber , Operation pOperationType)
	{
		this.phaseNumber=pPhaseNumber;
		this.operationType=pOperationType;
	}

	/**
	 * 
	 * @return
	 */
	public int getPhaseNumber()
	{
		return phaseNumber;
	}
	
	/**
	 * 
	 * @param pPhaseNumber
	 */
	public void setPhaseNumber(int pPhaseNumber)
	{
		this.phaseNumber=pPhaseNumber;
	}
	
	/**
	 * 
	 * @return
	 */
	public Operation getOperationType()
	{
		return operationType;
	}

	/**
	 * 
	 * @param pOperationType
	 */
	public void setOperationType(Operation pOperationType)
	{
		this.operationType=pOperationType;
	}

}
