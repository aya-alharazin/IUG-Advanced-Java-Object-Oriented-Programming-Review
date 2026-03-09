/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2;

/**
 *
 * @author aya
 */
public class GenericsDemo<T> {
    
    T [] arr = (T[])new Object[10];
    int index = 0 ;
    public void add(T value){
        arr[index++]=value;
    }
    
    
    public static void main(String[] args) {
//        Object names[] = {"Aya","Ahemd",12};
//        
//        for(Object name :names){
//            String str = (String)name;
//            System.out.println(str.charAt(0));
//        }
        
        GenericsDemo<String> g=new GenericsDemo();
        g.arr[0]="Aya";
        g.arr[1]="Ahmed";
        g.arr[2]="Sami";
    }
}
