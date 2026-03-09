/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming2;

/**
 *
 * @author aya
 */
public class EnumDemo {
    enum HttpResponse{
        OK(200,"Success"),
        CREATED(201,"Resource Created"),
        NOT_FOUND(404,"Not Found");
        
        final int code;
        final String message;
        
        HttpResponse(int code ,String message){
            this.code=code;
            this.message=message;
        }
        
        public int getCode(){
            return code;
        }
        public String getMessage(){
            return message;
        }
        
    }
    
    public static void main(String[] args) {
        HttpResponse http=HttpResponse.OK;
        System.out.println(http.getCode());
        System.out.println(http.getMessage());
        
        for(HttpResponse h:HttpResponse.values()){
            System.out.println(h);
        }
        System.out.println(http.ordinal());
    }
}
