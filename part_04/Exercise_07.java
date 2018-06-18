package part_04;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accessing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

class Stack{

    private char[] stack;
    private int push;
    private int pop;

    Stack(int size){

        stack = new char[size];

        push =0;
        pop = 0;

    }

    public static void main(String[] args) {

        Stack stacks = new Stack(10);

        System.out.println("pushing");

        for (char i = 'a'; i < 'p'; i++) {

            stacks.PushStack(i);
            System.out.println(i);
        }

        System.out.println("Popping");

                   for (char a ='a'; a < 'p'; a ++) {


                           System.out.println(stacks.StackPop(a));

                   }

        }



    void PushStack(char a) {

        if (push == stack.length) {

            System.out.println("Stack is full");

            return;
        }
        // -- going from the left to the right
        else if (push < stack.length) {
            stack[push++] = a;
        }


    }

    char StackPop(char a){

        if (pop == stack.length){

            System.out.println("No more plates");


        }else if (pop == push){

            stack[push++] = a;

        }

        return a;

    }
}