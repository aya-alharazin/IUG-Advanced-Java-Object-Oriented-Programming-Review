/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2.files;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author aya
 */
public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Creating , Reading , Writing (Text File)
//        File f=new File("src/programming2/files/test.txt");
//        try{
//        if(!f.exists()){
//            f.createNewFile();
//        }
//        }catch(IOException e){
//            System.out.println(e);
//        }
        
        
//        Scanner s=new Scanner(f);
//        
//        while(s.hasNextLine()){
//            System.out.println(s.nextLine());
//        }
//        s.close();
        

//    PrintWriter pr =new PrintWriter(new FileWriter(f, true));
//    pr.write("Aya\n");
//    pr.write("Nabil\n");
//    pr.write("Alharazin\n");
//    pr.flush();
//    pr.close();

    // Write - Read (Binary File)
    
    
//        DataOutputStream dos =new DataOutputStream(
//                new FileOutputStream("src/programming2/files/test.dat"));
//    
//        dos.writeInt(12);
//        dos.writeUTF("Aya");
//        dos.writeDouble(12.6);
//        dos.flush();
//        dos.close();
    
        DataInputStream dis =new DataInputStream(
                new FileInputStream("src/programming2/files/test.dat"));
    
        int x = dis.readInt();
        String name = dis.readUTF();
        double y = dis.readDouble();
        System.out.println(x);
        System.out.println(name);
        System.out.println(y);
        
    }
}
