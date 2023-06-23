// ********************************************************
// Reference-based implementation of the ADT Sorted List.
// *********************************************************

import java.util.Comparator;

/**
 * class SortedListReferenceBased
 *
 *    A class that implements the SortedListInterface using a linked list
 *
 */

public class SortedListReferenceBased extends ListReferenceBased
{

  	public SortedListReferenceBased()
  	// creates an empty list
  	{
		// YOUR CODE WILL BE HERE...
		super(); 
  	}  // end default constructor


  	public void add (Comparable item) throws ListException
  	// Inserts item into its proper position in a sorted list
  	// Throws an exception if the item connot be placed on the list
  	{
		try
		{
			// YOUR CODE WILL BE HERE...
			// DEFINE ANY HELPER METHOD(S) AND CALL IT/THEM, IF YOU NEED ANY.
			int indexToAdd = locateIndexToAdd(item);
			super.add(indexToAdd, item);
		}
		catch(Exception e)
		{
			throw new ListException("Add to List failed:  " + e.toString());
		}

	}


  	public void remove(Comparable item) throws ListException
  	// Removes the item from a sorted list.
  	// Throws an exception if the item is not found.
	
  	{
		int indexToRemove = locateIndexToRemove(item);
		if (indexToRemove != -1) {
			try
			{
				// YOUR CODE WILL BE HERE...
				// REQUIREMENT: USE "locateIndex(String item)" method.
				super.remove(indexToRemove);

			}
			catch(Exception e)
			{
				throw new ListException("Remove " + item.toString() + " from List failed:  " + e.toString());
			}
		}
	}

  	public int locateIndexToAdd(Comparable item)
  	// Returns the position where the item belongs or exists in a sorted list;
  	// item and the list are unchanged.
  	{
		// YOUR CODE WILL BE HERE...
		for (int i = 0; i < this.size(); i++){
			Comparable listItem = (Comparable) this.get(i);
			if (listItem.compareTo(item) >= 0) {
				return i;
			}
		}
		return this.size();
	}

  	public int locateIndexToRemove(Comparable item)
  	// Returns the position where the item belongs or exists in a sorted list;
  	// item and the list are unchanged.
  	{
		// YOUR CODE WILL BE HERE...
		for (int i = 0; i < this.size(); i++) {
			Comparable listItem = (Comparable) this.get(i);

			if (listItem.equals(item)) {
				return i;
			}
		}
		return -1;
	}
}
  // end SortedListReferenceBased


