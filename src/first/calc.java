
package first;


public class calc {
    String name = "shimaa";
    
    public int sum (int one, int two)
    {
        return one +two ;}
     public int min (int one, int two)
    {return one -two ;}
      public int x (int one, int two)
    {return one *two ;}
     public int devided (int one, int two)
    {if(two==0)
    {return 0 ;}
        return one/two ;}
     public void dere (int s)
     { for(int i=s; i>=0;i--)
             System.out.println(i);}
     public int [] xx (int x [],int y[])
     { int q[] = new int  [y.length];
     if (x.length!=y.length) 
     {return   null;}
     else
     {for(int i=0;i<q.length;i++)
     {q[i]= y[i]*x[i];}}
     return q;
     
     
     }
     public  calc (){
         
         this.name= "gfgfg";
     }
     
}
