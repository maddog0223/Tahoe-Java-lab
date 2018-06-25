package part_04;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileInputStream;
import java.security.PublicKey;
import java.util.Scanner;

/**
 The complement of a queue is a stack. It uses first-in, last-out accessing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

class StackFILS {

    private char[] stack;
    private int index;

    StackFILS(int size) {

        stack = new char[size];
        index = 0;
    }


    void PushStack(char val1) {

        if (index == stack.length) {

            System.out.println("stack is full");

            return;
        }

        for (val1 = 'a'; val1 <= 'p'; val1++) {

            stack[index++] = val1;


        }


    }

    char StackPop(char val2) {
        if (index == 0) {

            System.out.println("Stack is Empty");

        }


        stack[index--] = val2;

        return val2;
    }

    public static void main(String[] args) {

        StackFILS st = new StackFILS(10);

        System.out.println("Popping");

        for (char pop = st.stack[9]; pop <= 'a'; pop --){

            System.out.println(st.StackPop(pop));

        }
    }
}

