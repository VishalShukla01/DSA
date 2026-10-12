class solution{
  public static void ReverseLinnkedList(Node head){
     Node prev=null;
    Node curr=head;
    while(curr !=null){
       Node n=curr.next;
      curr.next=prev;
      prev=curr;
      curr=n;
    }
    head=prev;
    return prev;
  }
}
