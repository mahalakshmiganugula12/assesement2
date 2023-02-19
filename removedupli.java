import java.util.*;
class Node
{
  int d;
  Node net;
  public Node(int d)
  {
    this.d=d;
    net=null;
  }
}
class RemoveDuplicateEle
{
  public static void displayList(Node head)
  {
     Node temp=head;
     while(temp.nt!=null)
     {
        System.out.print(temp.d+"-->");
        temp=temp.nt;
     }
     System.out.println(temp.d);
  }
  
 public static Node removeDuplicates(Node head)
 {
     HashSet<Integer> hs=new HashSet<>();
     Node temp=head,prev=null;
     if(head==null)
       return null;
     if(head.net==null)
       return head;
     while(temp!=null)
     {
         int value=temp.d;
         if(!hs.contains(value))
          {
            hs.add(value);
            prev=temp;
            temp=temp.net;
          }
          else
          {
            prev.net=temp.net;
            temp=temp.net;
          }
     }
    return head;
 }

  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     Node head=null;
     int n=sc.nextInt();
     int e,p,ch;
     while(n-->0)
     {
        e=sc.nextInt();
        Node li=new Node(e);
        if(head==null)
             head=li;
        else
         {
            Node curr=head;
	    while(curr.net!=null)
	       curr=curr.net;
	    curr.net=l;
            
         }
     }
     displayList(head);
     head=removeDuplicates(head);
     displayList(head); 
    
  }
}

