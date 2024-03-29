
public class LinkedList <T> implements List <T> {
	private Node<T> head;
	private Node<T> current;

	public LinkedList () {
		head = current = null;
	}

	public boolean empty () {
		return head == null;
	}

	public boolean last () {
		return current.next == null;
	}
	public boolean full () {
		return false;
	}
	public void findFirst () {
		current = head;
	}
	public void findNext () {
		current = current.next;
	}
	public T retrieve () {
		return current.data;
	}
	public void update (T val) {
		current.data = val;
	}
	public void insert (T val) {
		Node<T> tmp;
		if (empty()) {
			current = head = new Node<T> (val);
		}
		else {
			tmp = current.next;
			current.next = new Node<T> (val);
			current = current.next;
			current.next = tmp;
		}
	}
	public void remove () {
		if (current == head) {
			head = head.next;
		}
		else {
			Node<T> tmp = head;

			while (tmp.next != current)
				tmp = tmp.next;

			tmp.next = current.next;
		}

		if (current.next == null)
			current = head;
		else
			current = current.next;
	}

	@Override
	public boolean findFirstEle(Cond<T> cnd) {
		if(cnd == null)
			return false;
	
	Node<T> temp= head;
		
		while(temp!=null) {
			
		if(cnd.test(temp.data)) {
			current=temp;
				return true;
				}
			temp=temp.next; }
		
			
		
		return false;
	}


	@Override
	public List<T> findAllEle(Cond<T> cnd) {
		List<T> list = new LinkedList<T>();
		
		if(cnd == null)
			return list;
		
		
		Node<T> temp= head;
		while(temp!=null) {
			if(cnd.test(temp.data))
				list.insert(temp.data);
			temp=temp.next;
				 }
		return list;
	}

}


