package prob4;

public class MyStack implements Stack {
	private int capacity;
	private int top ;
	private String[] buffer;
	private String[] tmp;
	private boolean isEmpty;
	
	public MyStack(int i) {
		this.capacity = i;
		this.top = 0;
		buffer = new String[capacity];
		isEmpty = false;
	}
	private void resize(int capacity) {
		this.capacity = capacity;
		this.tmp = new String[capacity];
		for(int i=0; i<buffer.length ; i++){
			tmp[i] = buffer[i];
		}
		//System.arraycopy(buffer, 0,tmp,0,buffer.length);
		
		this.buffer = tmp;
		//System.out.println("test"+buffer[0]);
	}
	@Override
	public void push(String item) {
		if(top==this.capacity){
			resize(this.capacity*2);
		}
		this.buffer[top++] = item;
	}

	@Override
	public String pop() throws MyStackException {
		String result = this.buffer[--top];
		if(top ==0 ){
			isEmpty = true;
			MyStackException e = new MyStackException("asd wef");
			throw e;
		}

		return result;
	}

	@Override
	public boolean isEmpty() {
		return isEmpty;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.capacity;
	}

}
