public class BasicStack <X> {

	private X[] data;
	private int stackpointer;
	
	
	public BasicStack()
	{
		data = (X[]) new Object[1000];
	}
	
	
	public void push(X item)
	{
		data[stackpointer++] = item;
	}
	
	public X pop()
	{
		if (size()==0) {
			throw new IllegalStateException("Stack is Empty!");
		}
		return data[--stackpointer];
	}
	
	public boolean contains(X item)
	{
		boolean found = false;
		for (int i = 0; i <size(); i++) {
			if (data[i].equals(item)) {
				found = true;
				break;
			}
		}
		
		return found;
	}
	
	public X access(X item)
	{
		while(size()>0)
		{
			if (item == pop()) {
				return item;
			}
		}
		throw new IllegalArgumentException("No match found for in the stack for : "+item);
	}
	
	public int size()
	{
		return stackpointer;
	}
}