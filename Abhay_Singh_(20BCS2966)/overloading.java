class Shadow
{
    void Area(){
        System.out.print("No Input Sorry !\n");
    }
    void Area(int x,int t){
        System.out.print("Area of rectangle is [Int parameters]\n:"+x*t);
    }
    void Area(float x,float t){
        System.out.print("Area of rectangle is [Int parameters]\n:"+x*t);
    }
    void Area(double x,double t){
        System.out.print("Area of rectangle is [Int parameters]\n:"+x*t);
    }
    void Area(char x,char t){
        System.out.print("Can't find Area in Char Input[char parameters]\n:");
        System.out.print(x+t);
    }
}




class overloading{
public static void main(String[] args) {
    Shadow object = new Shadow();
    object.Area();
    object.Area(5,6);
    object.Area(3.2,3.4);
    object.Area(4.65,8.56);
    object.Area('a','b');
}
}