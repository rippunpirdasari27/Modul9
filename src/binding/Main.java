package binding;

class Animal {
    static void suara(){
        System.out.println("suara hewan");
    }
    void makan(){
        System.out.println("hewan makan");
    }
}

class Dog extends Animal{
    @Override
    void makan(){
        System.out.println("anjing makan daging");
    }
}

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
       // a.suara();
       Animal.suara(); // eror karna bukan method static
       a.makan(); //dynamic binding

       Animal b = new Dog();  
       b.makan(); 
    }
    
}

