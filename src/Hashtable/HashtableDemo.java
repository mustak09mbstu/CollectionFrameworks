package Hashtable;

import java.util.*;

public class HashtableDemo {
    public static void main(String args[]){

        Hashtable h=new Hashtable();
        /*Will create an empty hashtable which initial capacity is 11 and Default fill ratio is .75*/

        h.put(new DefinedHashcode(5),"A");
        h.put(new DefinedHashcode(2),"B");
        h.put(new DefinedHashcode(6),"C");
        h.put(new DefinedHashcode(15),"D");
        h.put(new DefinedHashcode(23),"E");
        h.put(new DefinedHashcode(16),"F");


        System.out.print(h);

    }

    }

    class DefinedHashcode{

    int i;

        public DefinedHashcode(int i) {
            this.i = i;
        }

        @Override
        public int hashCode() {
            return i; //i%11 if i>11
            //return i%9; // If Initial Capacity Defined 9
        }

        @Override
        public String toString() {
            return i+"";
        }
    }


