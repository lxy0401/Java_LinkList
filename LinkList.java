package Struck;

import javax.sound.midi.Soundbank;

//import javax.swing.text.html.AccessibleHTML.TableElementInfo.TableAccessibleContext;

//import DBLinkList.Link;
//import DBLinkList.LinkImpl;

//interface Link
//{
//	boolean linkListIsEnpty();
//	void linkListPushBack(Object object);
//	void linkListPopBack();
//	void linkListPushFront(Object object);
//	void linkListPopFront();
//	void linkListPrint(LinkNode node);
//	int linkListFindindex(LinkNode node,Object object);
//	Object linkListObject(int index);
//	void linkListInsertAfter(LinkNode node,Object object);
//	void linkListInsertBefore(LinkNode node,Object object);
//	void linkListRemove(LinkNode node,Object object);
//	void linkListErase(int index);
//	int linkListSize();
//}

class Node
{
	public Node next;
	public Object object;
	public Node(Object object)
	{
		this.object=object;
	}
	
	public void print() {
		System.out.print(object);
		
	}
}

class LinkListMethod
{
	public Node head;
	public int pos=0;
	public int size=0;
	public LinkListMethod()
	{
		this.head = null;
	}
	
	//�����ʼ��
	public void linkListInit() {
		head =null;
		size = 0;
	}
	
	//�ж������Ƿ�Ϊ��
	public boolean linkListIsEmpty()
	{
		return (size == 0);
		
	}
	
	//β�巨
	public void linkListPushBack(Object object)
	{
		Node newnode = new Node(object);
		if(head == null)
		{
			head = newnode;
		}
		else 
		{
			Node cur=head;
			while(cur.next!=null)
			{
				cur=cur.next;
			}
			cur.next = newnode;
		}
		size++;
	}
	
	//βɾ��
	public void linkListPopBack() {
		if(head == null)
		{
			return ;
		}
		else {
			Node cur=head;
			while(cur.next.next!=null)
			{
				cur=cur.next;
			}
			
			cur.next=null;
		}
		size--;
		
	}
	
	//ͷ�巨
	public void linkListPushFront(Object object)
	{
		Node newnode=new Node(object);
		if(head == null)
		{
			head = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
		size++;
	}
	
	//ͷɾ��
	public void linkListPopFront() {
		if(head == null)
		{
			return ;
		}
		else
		{
			head=head.next;
		}
		size--;
	}
	
	//����������Ԫ�ص�λ��
	int linkListFindindex(Object to_find)
	{
		if(head == null)
		{
			return -1;
		}
		else
		{
			int index = 0;
			Node cur=head;

			while(cur.object!=to_find)
			
			{
					index++;
					cur=cur.next;
				
			}
			return index;
		}	
		
	}
	
	//�����±���Ԫ��
	Object linkListObject(int index)
	{
		Node cur=head;
		if(head == null)
		{
			//������
			return null;
		}
		if(index<0 || index>size-1)
		{
			//�Ƿ�����
			return null;
		}
		else
		{
			for(int i=0;i<index;i++)
			{
				cur=cur.next;
			}
			return cur.object;
		}
		
		
	}
	
	//��posλ��֮�����Ԫ��
	void linkListInsertAfter(int pos,Object object)
	{
		if(pos < 0 || pos >size-1)
		{
			//�Ƿ�λ��
			return ;
		}
		else
		{
			Node cur=head;
			Node newnode=new Node(object);
			for(int index=0;index!=pos;index++)
			{
				cur=cur.next;
			}
			//��ʱcurΪposλ���ϵĵ�
			Node cur_next=cur.next;
			newnode.next=cur_next;//�½ڵ����һ���ڵ�Ϊposλ�õ���һ���ڵ�
			cur.next=newnode;//posλ�õ���һ���ڵ�Ϊ�½ڵ�
			size++;		
		}
	}
	
	//��posλ��֮ǰ����Ԫ��
	void linkListInsertBefore(int pos,Object object)
	{
		if(pos < 0 || pos >size-1)
		{
			//�Ƿ�λ��
			return ;
		}
		else if(size == 1)
		{
			//ͷ�巨
			linkListPushFront(object);
			size++;
		}
		else
		{
			int index=0;
			Node cur=head;
			while(cur!=null)
			{			
				index++;
				cur=cur.next;
				if(index+1 == pos)
				{
					linkListInsertAfter(index-1, object);					
				}
				
			}
			size++;
		}

	}
	//ɾ��Ԫ��
	void linkListRemove(Object to_delete)
	{
		if(head == null)
		{
			return ;
		}
		else
		{
			Node cur=head;
			//Node head_next=cur.next;
			Node cur_next=cur.next;
			while(cur.object!=to_delete)
			{
				cur=cur.next;
				cur_next=cur_next.next;
			}
			cur.next=cur_next.next;			
		}
		size--;
	}
	
	//��ӡ�б�
	public void linkListprint()
	{
		Node cur=head;
		while(cur!=null)
		{
			cur.print();
			cur=cur.next;
		}
		System.out.println();
	}
}
public class LinkList {
	public static void main(String[] args) {
		LinkListMethod linkListMethod=new LinkListMethod();
//		System.out.println("����β�巨����β���ĸ�Ԫ��");
//		linkListMethod.linkListPushBack("a");
//		linkListMethod.linkListPushBack("b");
//		linkListMethod.linkListPushBack("c");
//		linkListMethod.linkListPushBack("d");
//		linkListMethod.linkListprint();
//		linkListMethod.linkListInit();
//		System.out.println("����βɾ������βɾ����Ԫ��");
//		linkListMethod.linkListPopBack();
//		linkListMethod.linkListPopBack();
//		linkListMethod.linkListprint();
//		System.out.println("����ͷ�巨����ͷ���ĸ�Ԫ��");
//		linkListMethod.linkListPushFront("a");
//		linkListMethod.linkListPushFront("b");
//		linkListMethod.linkListPushFront("c");
//		linkListMethod.linkListPushFront("d");
//		linkListMethod.linkListprint();
//		System.out.println("����ͷɾ������ͷɾ����Ԫ��");
//		linkListMethod.linkListPopFront();
//		linkListMethod.linkListPopFront();
//		linkListMethod.linkListprint();
//		System.out.println("���Ը���Ԫ�����±�");
//		linkListMethod.linkListInit();
//		linkListMethod.linkListPushBack("a");
//		linkListMethod.linkListPushBack("b");
//		linkListMethod.linkListPushBack("c");
//		linkListMethod.linkListPushBack("d");
//		linkListMethod.linkListprint();
//		int index1=linkListMethod.linkListFindindex("a");
//		System.out.println("a:ϣ������0��ʵ�ʷ���"+index1);
//		int index2=linkListMethod.linkListFindindex("b");
//		System.out.println("b:ϣ������1��ʵ�ʷ���"+index2);
//		int index3=linkListMethod.linkListFindindex("c");
//		System.out.println("c:ϣ������2��ʵ�ʷ���"+index3);
//		int index4=linkListMethod.linkListFindindex("d");
//		System.out.println("d:ϣ������3��ʵ�ʷ���"+index4);
//		System.out.println("���Ը����±���Ԫ��");
//		Object object1=linkListMethod.linkListObject(0);
//		System.out.println("0:ϣ������a��ʵ�ʷ���"+object1);
//		Object object2=linkListMethod.linkListObject(1);
//		System.out.println("1:ϣ������b��ʵ�ʷ���"+object2);
//		Object object3=linkListMethod.linkListObject(2);
//		System.out.println("2:ϣ������c��ʵ�ʷ���"+object3);
//		Object object4=linkListMethod.linkListObject(3);
//		System.out.println("3:ϣ������d��ʵ�ʷ���"+object4);
//		System.out.println("������posλ��֮������µ�Ԫ��");
//		System.out.println("��a֮�����Ԫ��x");
//		linkListMethod.linkListInsertAfter(0, "x");
//		linkListMethod.linkListprint();
//		System.out.println("��b֮�����Ԫ��y");
//		linkListMethod.linkListInsertAfter(2, "y");
//		linkListMethod.linkListprint();
//		System.out.println("��c֮�����Ԫ��m");
//		linkListMethod.linkListInsertAfter(4, "m");
//		linkListMethod.linkListprint();
//		System.out.println("��d֮�����Ԫ��n");
//		linkListMethod.linkListInsertAfter(6, "n");
//		linkListMethod.linkListprint();
		System.out.println("������posλ��֮ǰ�����µ�Ԫ��");
		linkListMethod.linkListInit();
		linkListMethod.linkListPushBack("a");
		linkListMethod.linkListPushBack("b");
		linkListMethod.linkListPushBack("c");
		linkListMethod.linkListPushBack("d");
		linkListMethod.linkListprint();
		System.out.println("��a֮ǰ����Ԫ��x");
		linkListMethod.linkListInsertBefore(0, "x");
		linkListMethod.linkListprint();
		System.out.println("��b֮ǰ����Ԫ��y");
		linkListMethod.linkListInsertBefore(2, "y");
		linkListMethod.linkListprint();	
		System.out.println("��c֮ǰ����Ԫ��m");
		linkListMethod.linkListInsertBefore(4, "m");
		linkListMethod.linkListprint();		
		System.out.println("��d֮ǰ����Ԫ��n");
		linkListMethod.linkListInsertBefore(6, "n");
		linkListMethod.linkListprint();	
		System.out.println("����ɾ��Ԫ��");
		linkListMethod.linkListInit();
		linkListMethod.linkListPushBack("a");
		linkListMethod.linkListPushBack("b");
		linkListMethod.linkListPushBack("c");
		linkListMethod.linkListPushBack("d");
		linkListMethod.linkListprint();
		System.out.println("ɾ��Ԫ��a");
		linkListMethod.linkListRemove("a");
		linkListMethod.linkListprint();
		//System.out.println("ɾ��Ԫ��b");
		//linkListMethod.linkListRemove("b");
		//linkListMethod.linkListprint();
		System.out.println("ɾ��Ԫ��c");
		linkListMethod.linkListRemove("c");
		linkListMethod.linkListprint();
//		System.out.println("ɾ��Ԫ��d");
//		linkListMethod.linkListRemove("d");
//		linkListMethod.linkListprint();
		
		

	}

}
