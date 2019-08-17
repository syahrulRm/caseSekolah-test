/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp.dayII;

public class array {
    public static void main (String []args) {
        
        int[] a = {2,4,3,1};
        
        int sum = 0 ;
        for (int i = 0; i<a.length;i++) sum += a[i];
        
        float [] d = new float [sum];
        for (int i= 0; i<d.length; i++) d[i] = 1.0f / (i+1);
        
        for (int i = 1;i<d.length;i +=2)
            System.out.println("d["+ i+"]="+ d[i]);
        
    }
}
