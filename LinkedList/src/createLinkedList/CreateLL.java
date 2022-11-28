package createLinkedList;

class Node1 {
	int data ;
	Node1 next ;
	Node1(int x){
		data = x;
		next = null;
	}
}

public class CreateLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 head = new Node1(10);
		Node1 temp = new Node1(20);
		Node1 temp1 = new Node1(30);
		Node1 temp2 = new Node1(40);
		
		head.next = temp;
		temp.next = temp1;
		System.out.println(head.data + "-->"+temp.data+"-->"+temp1.data+"-->"+temp2.data);

	}

}
