/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_list_linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Ali_Shojib
 */
public class tests {

    public static void main(String[] args) {
        
        //list create

        LinkedList<student> lists = new LinkedList();
        
        //student create

        student s1 = new student(101, "Muhammad chy");
        student s2 = new student(102, "Yousuf bin jakir");
        student s3 = new student(103, "Abid ullah");
        student s4 = new student(104, "Ali Shojib");
        student s5 = new student(105, "Sadman sakib");
        student s6 = new student(106, "Jahid mama");
        student s7 = new student(107, "Abdul Jobbar");
        
        //put students infon in linked list

        lists.add(s1);
        lists.add(s2);
        lists.add(s3);
        lists.add(s4);
        lists.add(s5);
        lists.add(s6);
        lists.add(s7);
        
        //print info

        for (student st : lists) {
            System.out.println("ID :" + st.id + "  Name : " + st.name + "  class :" + student.classna);
        }

    }

}
