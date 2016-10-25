
package first;


public class First {

   
    public static void main(String[] args) {
        spp QQ= new spp();
        QQ.print();
        spp2 WW= new spp2();
        WW.print();
        WW.df(0);
        NewClass WE= new NewClass();
        WE.printvalue(WW);
        WE.printvalue(new myinterface (){
            @Override
            public void print() {
System.out.println("ahmed");            }

            @Override
            public int getdata() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void df(int u) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        new myinterface (){
            @Override
            public void print() {
                System.out.println("good");
            }

            @Override
            public int getdata() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void df(int u) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }.print();
        myinterface t= WW;
        t.print(); // abstract overrided methode
        /*
             
        ولازم يكون فيه دوال الانترفيس والتي هناspp2الي هو اوبجيك تمن   wwيشير للدوال اللي موجودة في
        تشير الي دوال الانترفيس فقط ويمنكك
        جعلها تشير الي كل دوال الي موجودة في   
spp2
      
       
       
        عن  طريق
        التحويل
        (spp2)t
        
        
        */
        /*
        
        
        بمجرد فتح مجال للتعامل مع النتر فيس عن طريق عمل امبليمنت ليه
        ينتظر النظام ال ان يتم استدعاء دوال النترفيس والتعامل معها من خلال احد ما
        وذلك بانشائه كلاس بيعمل امبيلمنت لل النترفيس
        ويعمل الي هو عاوزه بعد كدا النظم بيعمل اوبجيكت من الكلاس الي اشائه المستخدم
        ويحطو في كلاس تاني النظام عامله عشان ينفذ المطلوب تنغيذ من المستخدم
        */
        mypdf AS= new mypdf();
        pdf TE= new pdf();
        TE.runplugin(AS);
        TE.closeplugin(AS);
        int x ;
        x=6;
        x=5;
        x=6;
        
        System.out.println(x);
        int y ;
        calc c =new calc();
        System.out.println(y= c.min(3, 3));
        System.out.println(y=c.devided(9, 3));
        System.out.println(y=c.sum(6, 3));
        System.out.println(y=c.x(y, y));
        c.dere(y);
        System.out.println(c.name);
        
       strop z =new strop("ahmed");
       z.values= "asa";
       z.strtoar();
       
        char w []=z.strtoar();
        System.out.println(w);
        
         System.out.println(w[0]);
         for(int b  :w)
           System.out.println(b);
         
         int a []= {1,2,3};
         int b []= {1,2,3};
       int n [] =c.xx(a, b);
       
       if(n!= null)
       { for(int i =0 ;i<n.length;i++)
           System.out.print(n[i]);}
           
       
       else 
         System.out.println("n is null") ;
       int CV[]= null ;
     books book = new books("meen","hh",44,77,88);
     book.openbook();
     System.out.println(book.openbook());
     book.closebook();
   System.out.println(book.closebook());
     book.openbook();
     book.moveto(-5);
     book.moveto(14);
     System.out.println(book.moveto(-5));
     book.bookinfo();
     
     
       strop l =new strop(book.name);
     System.out.println(l.strtoar()) ;
        char p [] = {'i','8','8'};
        System.out.println(p);
        System.out.println(strop.equeal("ahmed", "amaal"));
        
        
        
        
        
        
       
    }
    
}
