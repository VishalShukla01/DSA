class Soltion{
  public boolean searchElement(Node head, int key){
    Node curr=head;
    while(curr != null){
      if(curr.data==key) return true;
      curr=curr.next;
    }
    return false;
  }
}
  
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
       Node curr=head;
       while(curr !=null){
           if(curr.data==key) return true;
           curr=curr.next;
       }
       return false;
    }
}
