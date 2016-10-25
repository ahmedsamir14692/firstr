
package first;


public class NewClass {
    public void printvalue(myinterface v)// النترفيس ممكن تاخد منه ابجيكت
            /*
            ممكن يكون اي اوبجيكت من اي كلاس عامل امليمنت لل النتر فيس
            
            */
    {
        v.print(); /*
           هنا طبعا مش الدالة اللي موجودة في النترفيس   print   
        وكن الدالة اللي موجودة في الكلاس اللي عامل امبليمنت
        لل الانترفيس والي اكيد فيه الدالة برينت
        ولما اخد اوبجيكت منه اساويه بمتفير من نوع النتر فيس
        هيشبر الي الدالة اللي موحودة فيه وليست اللي موجودة في النترفيس
        برينت هنا مغيرة حسب نوع البجيكت في
        v
        
        
        */
        if(v instanceof spp)
            System.out.println("form spp 1");
        if(v instanceof spp2)
            System.out.println("form spp 2");
            
    }
    
    
    
}
