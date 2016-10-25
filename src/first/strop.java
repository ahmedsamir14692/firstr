
package first;


public class strop { 
    public String values;
    public strop (String s)
    {this.values = s;}
    public char []strtoar()
    {char x []= new char [values.length()];
            for(int i =0;i <x.length;i++)
            { x[i]=values.charAt(i);}
            return x;
            }
    public static boolean equeal(String x, String y)
    { 
        strop z =new strop(x);
        char r[]= z.strtoar();
        z=new strop(y);
         char t[]= z.strtoar();
         if(r!=t)
             return false;
         return true;
       
        
        
        
        
        
    }
   
}
