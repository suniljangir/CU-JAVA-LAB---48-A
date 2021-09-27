class Shadow{
    void Display(){
        System.out.print("Mr. Sunil sir is our java faculty\n");
    }
}
class A extends Shadow{
    void Display(){
        System.out.print("He is faculty of Chandigarh Univeristy \n");
    }
}
class B extends Shadow{
    void Display(){
        System.out.print("He is from Chandigarh.\n");
    }
}
class overriding{
    public static void main(String[] args) {
        B objectB = new B();
        A objectA = new A();
        Shadow object = new Shadow();
        object.Display();
        objectA.Display();
        objectB.Display();

    }
}