public class A 

{ 

    int a = 12; 

} 

class B extends A

{ 

    int a = 18; 

  

    void display() 

    { 

        System.out.println(super.a); 

    }

} 

class Test 

{ 

    public static void main(String[] args) 

    { 

        B b = new B(); 

        b.display(); 

    } 

} 
