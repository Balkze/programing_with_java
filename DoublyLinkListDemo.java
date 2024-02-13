import java.util.*;
public class DoublyLinkListDemo {
    public static void main(String[] args) {
        int i,ch,element,position;
        LinkedList<Integer> dblList = new LinkedList<Integer>();
        System.out.println("1.Insert element at begining");
        System.out.println("2.Insert element at end");
        System.out.println("3.Insert element at position");
        System.out.println("4.Delete a given element");
        System.out.println("5.Display elements in the list");
        System.out.println("6.Exit");
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Choose your choice(1 - 6) :");
            ch=sc.nextInt();
            switch(ch) {
                case 1: // To read element form the user
                        System.out.print("Enter an element to insert at begining : ");
                        element=sc.nextInt();
                        // to add element to doubly linked list at begining
                        dblList.addFirst(element);
                        System.out.println("Successfully Inserted");
                        break;
                case 2: // To read element form the user
                        System.out.print("Enter an element to insert at end : ");
                        element=sc.nextInt();
                        // to add element to doubly linked list at end
                        dblList.addLast(element);
                        System.out.println("Successfully Inserted");
                        break;
                case 3: // To read position form the user
                        System.out.print("Enter position  to insert element : ");
                        position=sc.nextInt();
                        // checks if the position is lessthan or equal to list size.
                        if(position<=dblList.size()) {
                            // To read element
                            System.out.print("Enter element : ");
                            element=sc.nextInt();
                            // to add element to doubly linked list at given position
                            dblList.add(position,element);
                            System.out.println("Successfully Inserted");
                        }
                        else {
                            System.out.println("Enter the size between 0 to"+dblList.size());
                        }
                        break;
                case 4:    // To read element form the user to remove
                        System.out.print("Enter element to remove : ");
                        Integer ele_rm;
                        ele_rm=sc.nextInt();
                        if (dblList.contains(ele_rm)){
                            dblList.remove(ele_rm);
                            System.out.println("Successfully Deleted");
                            Iterator itr=dblList.iterator(); 
                            System.out.println("Elements after deleting :"+ele_rm);
                            while(itr.hasNext()) {  
                                System.out.print(itr.next()+"<->"); 
                            }
                            System.out.println("NULL"); 
                        }
                        else {
                            System.out.println("Element not found");
                        }
                        break;
        
                case 5:    // To Display elements in the list
                        Iterator itr=dblList.iterator(); 
                        System.out.println("Elements in the list :");
                        while(itr.hasNext()) {  
                            System.out.print(itr.next()+"<->"); 
                        }
                        System.out.println("NULL");
                        break;

                case 6:    System.out.println("Program terminated");
                        break;
                default:System.out.println("Invalid choice");
            }
        }
        while(ch!=6);
    }
}