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
public class TestMaxHeap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Integer[] ar = {12,5,9,7,3,8,6,7,3}; 
       System.out.print("input list: ");
        for(int i =0;i<ar.length;i++)
      {
       System.out.print(ar[i] + ", ");
      }
        System.out.print("\n");
       MaxHeap test = new MaxHeap(ar); 
      System.out.print("Input list in level order: "+test.toString()+"\n");
         test.insert(25);
         System.out.print("heap after insert: "+test.toString()+"size = :" + test.getSize()+" memory = " + test.getMemory()+"\n");
       test.deleteMax();
       System.out.print("input list after max is deleted: " +test.toString()+"\n");
       MaxHeap.heapsort(ar);
       System.out.print("input list afer heapsort: ");
      for(int i =0;i<ar.length;i++)
      {
       System.out.print(ar[i] + ", ");
      }
      System.out.print("\n");
         Integer[] ar1 = {}; 
       System.out.print("empty list test");
       
        System.out.print("\n");
       MaxHeap test1 = new MaxHeap(ar1);
      System.out.print("Input list in level order: "+test1.toString()+"\n");
       test1.deleteMax();
       System.out.print("input list after max is deleted: " +test1.toString()+"\n");
       MaxHeap.heapsort(ar1);
       System.out.print("input list afer heapsort: ");
      for(int i =0;i<ar1.length;i++)
      {
       System.out.print(ar1[i] + ", ");
      }
    
    }
    
}
