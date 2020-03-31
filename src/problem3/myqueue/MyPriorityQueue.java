/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;



import problem3.myLinkedList.LinkedList;

import problem3.student.MyStudent;



public class MyPriorityQueue {

    LinkedList linkedList = new LinkedList();

    public void enqueue(MyStudent student){

        linkedList.addLast(student);

    }



    public void dequeue(){

        linkedList.deleteFirst();

    }

    public void show(){

        linkedList.display();

    }

}
