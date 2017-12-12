package model;

import java.util.LinkedList;

public class Product {
		
		private LinkedList<Phase> range;
		
	
		public Product()
		{
			this.range=new LinkedList<Phase>(); 
		}
		
		/**
		 * 
		 * @param pRange
		 */
		public Product(LinkedList<Phase> pRange)
		{
			this.range=pRange;
		}
		
		/**
		 * 
		 * @param pPhase
		 */
		public void add(Phase pPhase)
		{
			this.range.add(pPhase);
		}
		
		/**
		 * 
		 * @param pPhase
		 * @param pIndex
		 */
		public void addAt(Phase pPhase , int pIndex)
		{
			this.range.add(pIndex , pPhase);
		}
		
}
