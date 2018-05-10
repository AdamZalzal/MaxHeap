/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maxheap;

/**
 *
 * @author adamzalzal
 */
public class MaxHeap { //initialize parameters
    private Integer[] heap;
    private int size;
    private int mem;
    
    public MaxHeap(int s) //constructor from size
    {
        size = s;
        mem = s;
    }
    //average runtime is O(n), worst case is O(nlog(n))
    //space time complexity worst case is O(n)
    public MaxHeap(Integer[] someArray) //constructor from input list
    {
       size = 0; //set initial size and memory
       mem = 1; 
        heap = new Integer[someArray.length]; //make empty heap size of input list
        for(int i  = 0; i<someArray.length;i++) //loop through input array
        {
           this.insert(someArray[i]); //insert each item in input into heap
   
        }
         this.size = someArray.length; //set size and memory
        this.mem = someArray.length;
    }
    //average runtime is O(1), worst case runtime is O(log(n))
    //space complexity is worst case O(n)
    public void insert(int n)
    {
        if(size == mem) //if heap is full
        {
            
            mem *=2; //double memory alloted
            Integer[] hold = new Integer[mem]; //make empty heap of new memory size
            for(int j = 0;j<size;j++) //store values from old heap
            {
                hold[j] = this.heap[j];
            }
            this.heap = hold; //copy into new heap
        }
    this.heap[size] = n; //set last item in array to n
    int i = size; //set counter to size
    int parent,temp; //initialize storage variables
    while(i>0) // while i is greater than 0 
    {
        
        parent = (i-1)/2; //find parent indext
        if(this.heap[i]>this.heap[parent]) //if n is greater than its parent
        {
            temp = this.heap[parent];  //exchange parent and n
            this.heap[parent] = this.heap[i];
            this.heap[i] = temp;
        }
        else{
            break; //repeat until n is less than parent
        }
        i = parent; //set i to parent
    }
     size+=1; //increment size
    }
   public String toString()
   {
       String output = ""; //set empty string variable
       for(int i=0;i<size;i++) //loop through and add each item to string
       {
           output+= this.heap[i] + ", ";
       }
       return output;
   }
   //average runtime is  O(log(n))
   //space complexity is O(n)
   public int deleteMax()
   {
   if(size ==0)
   {
       return 0;
   }
       int temp = this.heap[0]; //store root of heap
       int temp2; //make temp variable
       this.heap[0] = this.heap[size-1]; //switch last leaf with root
       
       this.heap[size-1] = null; //set last item to null
       int i =0; //set counter to 0
       size-=1;//decrement size
       while(true)
       {
           int c1 = i*2+1; //find left child
           int c2 = i*2+2;// find right child
           
           
           if((c1<=(size-1))&& (this.heap[i]<this.heap[c1])&&(heap[c1]>heap[c2])) //if child index is in array and parent is less than child and left child is greater than right
           {
             
               temp2 = this.heap[i];
               this.heap[i] = this.heap[c1];
               this.heap[c1] = temp2;
               i = c1;
              
           }
           else if((c2<=(size-1))&&(this.heap[i]<this.heap[c2]) )
           {
              
                temp2 = this.heap[i];
               this.heap[i] = this.heap[c2];
               this.heap[c2] = temp2;
              i = c2;
           }
           else{
               break;
           }
       }
      
       return temp;
       
   }
   public Integer[] getHeap()
   {
       Integer[] temp = new Integer[size]; //return copy of the heap
       for(int i = 0; i<size; i++)
       {
           temp[i] = heap[i];
       }
       return temp;
   }
   public int  getMemory()
   {
       return mem; //return the memory alloted
   }
   public int getSize()
   {
       return size; //return the size
   }
   //runtime worst case O(nlog(n))
   //space complexity is O(n)
   public static void heapsort(Integer[] arrayToSort)
   {
       MaxHeap temp = new MaxHeap(arrayToSort); //make heap from array
       Integer[] temp2 = new Integer[arrayToSort.length]; //make empty array
       for(int i = 0; i<arrayToSort.length; i++) //loop through size of array to be sorted
       {
          arrayToSort[arrayToSort.length-1-i] = temp.deleteMax(); //delete max and assign each item to opposite position in temp list
    
       }
           
   }
}
