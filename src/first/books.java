
package first;


public class books {
     public String name;
     public String the_author;
     public int pedate ;
     public int last_page_number ;
     public int  current_page;
     public boolean is_open;
     public int num_of_pages;
   public int tall_in_cms;
    public int width_in_cms ;
    public int tkiness;
     public books( String q , String w , int e , int r , int t)
     {  
         this.name= q ;
         this.the_author =w ;
         this.pedate=e;
         this.last_page_number=r;
         this.num_of_pages=t;
         this.is_open=false;
         

     
     
     }
    public boolean openbook()
  
     {
         if(is_open)
             return false;
        
             this.is_open = true ;
             return true ;
             
    
     }
    public boolean closebook()
            
    {
        if(!is_open)
           return false;
       this.is_open=false;
           return true;
            
            
    
    
    }
    public boolean moveto (int page)
    {
        if(!is_open)
        return false;
        if(page<1)
            return false ;
        if (page>last_page_number)
        return false ;
        this.current_page=page;
        return true ;
        
        
        
    }
    public void bookinfo()
    {System.out.println("name :" + this.name);
    {System.out.println("author :" + this.the_author);}
    
    }
    
}
