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
	
	//链表初始化
	public void linkListInit() {
		head =null;
		size = 0;
	}
	
	//判断链表是否为空
	public boolean linkListIsEmpty()
	{
		return (size == 0);
		
	}
	
	//尾插法
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
	
	//尾删法
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
	
	//头插法
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
	
	//头删法
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
	
	//查找链表中元素的位置
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
	
	//根据下标找元素
	Object linkListObject(int index)
	{
		Node cur=head;
		if(head == null)
		{
			//空链表
			return null;
		}
		if(index<0 || index>size-1)
		{
			//非法坐标
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
	
	//在pos位置之后插入元素
	void linkListInsertAfter(int pos,Object object)
	{
		if(pos < 0 || pos >size-1)
		{
			//非法位置
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
			//此时cur为pos位置上的点
			Node cur_next=cur.next;
			newnode.next=cur_next;//新节点的下一个节点为pos位置的下一个节点
			cur.next=newnode;//pos位置的下一个节点为新节点
			size++;		
		}
	}
	
	//在pos位置之前插入元素
	void linkListInsertBefore(int pos,Object object)
	{
		if(pos < 0 || pos >size-1)
		{
			//非法位置
			return ;
		}
		else if(size == 1)
		{
			//头插法
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
	//删除元素
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
	
	//打印列表
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
//		System.out.println("测试尾插法——尾插四个元素");
//		linkListMethod.linkListPushBack("a");
//		linkListMethod.linkListPushBack("b");
//		linkListMethod.linkListPushBack("c");
//		linkListMethod.linkListPushBack("d");
//		linkListMethod.linkListprint();
//		linkListMethod.linkListInit();
//		System.out.println("测试尾删法——尾删两个元素");
//		linkListMethod.linkListPopBack();
//		linkListMethod.linkListPopBack();
//		linkListMethod.linkListprint();
//		System.out.println("测试头插法——头插四个元素");
//		linkListMethod.linkListPushFront("a");
//		linkListMethod.linkListPushFront("b");
//		linkListMethod.linkListPushFront("c");
//		linkListMethod.linkListPushFront("d");
//		linkListMethod.linkListprint();
//		System.out.println("测试头删法——头删两个元素");
//		linkListMethod.linkListPopFront();
//		linkListMethod.linkListPopFront();
//		linkListMethod.linkListprint();
//		System.out.println("测试根据元素找下标");
//		linkListMethod.linkListInit();
//		linkListMethod.linkListPushBack("a");
//		linkListMethod.linkListPushBack("b");
//		linkListMethod.linkListPushBack("c");
//		linkListMethod.linkListPushBack("d");
//		linkListMethod.linkListprint();
//		int index1=linkListMethod.linkListFindindex("a");
//		System.out.println("a:希望返回0，实际返回"+index1);
//		int index2=linkListMethod.linkListFindindex("b");
//		System.out.println("b:希望返回1，实际返回"+index2);
//		int index3=linkListMethod.linkListFindindex("c");
//		System.out.println("c:希望返回2，实际返回"+index3);
//		int index4=linkListMethod.linkListFindindex("d");
//		System.out.println("d:希望返回3，实际返回"+index4);
//		System.out.println("测试根据下标找元素");
//		Object object1=linkListMethod.linkListObject(0);
//		System.out.println("0:希望返回a，实际返回"+object1);
//		Object object2=linkListMethod.linkListObject(1);
//		System.out.println("1:希望返回b，实际返回"+object2);
//		Object object3=linkListMethod.linkListObject(2);
//		System.out.println("2:希望返回c，实际返回"+object3);
//		Object object4=linkListMethod.linkListObject(3);
//		System.out.println("3:希望返回d，实际返回"+object4);
//		System.out.println("测试在pos位置之后插入新的元素");
//		System.out.println("在a之后插入元素x");
//		linkListMethod.linkListInsertAfter(0, "x");
//		linkListMethod.linkListprint();
//		System.out.println("在b之后插入元素y");
//		linkListMethod.linkListInsertAfter(2, "y");
//		linkListMethod.linkListprint();
//		System.out.println("在c之后插入元素m");
//		linkListMethod.linkListInsertAfter(4, "m");
//		linkListMethod.linkListprint();
//		System.out.println("在d之后插入元素n");
//		linkListMethod.linkListInsertAfter(6, "n");
//		linkListMethod.linkListprint();
		System.out.println("测试在pos位置之前插入新的元素");
		linkListMethod.linkListInit();
		linkListMethod.linkListPushBack("a");
		linkListMethod.linkListPushBack("b");
		linkListMethod.linkListPushBack("c");
		linkListMethod.linkListPushBack("d");
		linkListMethod.linkListprint();
		System.out.println("在a之前插入元素x");
		linkListMethod.linkListInsertBefore(0, "x");
		linkListMethod.linkListprint();
		System.out.println("在b之前插入元素y");
		linkListMethod.linkListInsertBefore(2, "y");
		linkListMethod.linkListprint();	
		System.out.println("在c之前插入元素m");
		linkListMethod.linkListInsertBefore(4, "m");
		linkListMethod.linkListprint();		
		System.out.println("在d之前插入元素n");
		linkListMethod.linkListInsertBefore(6, "n");
		linkListMethod.linkListprint();	
		System.out.println("测试删除元素");
		linkListMethod.linkListInit();
		linkListMethod.linkListPushBack("a");
		linkListMethod.linkListPushBack("b");
		linkListMethod.linkListPushBack("c");
		linkListMethod.linkListPushBack("d");
		linkListMethod.linkListprint();
		System.out.println("删除元素a");
		linkListMethod.linkListRemove("a");
		linkListMethod.linkListprint();
		//System.out.println("删除元素b");
		//linkListMethod.linkListRemove("b");
		//linkListMethod.linkListprint();
		System.out.println("删除元素c");
		linkListMethod.linkListRemove("c");
		linkListMethod.linkListprint();
//		System.out.println("删除元素d");
//		linkListMethod.linkListRemove("d");
//		linkListMethod.linkListprint();
		
		

	}

}
