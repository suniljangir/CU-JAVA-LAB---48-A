/*
Name : Abhay Singh
UID  : 20BCS2966
Date :  18 sept 
topic : inheritance 
*/



//                                  single-level inheritance example

/*


class num1
{
    int x = 50;
    num1()
    {
        System.out.print("Single level inheritance example \n");
    }
    void input1()
    {
        System.out.print("Value of X is \t:"+x+"\n");
    }
}
class num2 extends num1
{
    int y = 30;
    void input2()
    {
        System.out.print("Value of Y is \t:"+y+"\n");  
    }
}
class inheritance{
    public static void main(String[] args)
    {
        num2 object = new num2();
        object.input1();
        object.input2();
    }
}
*/


//                                  Multi-level inheritance example

/*
class num1
{
    int x = 50;
    num1()
    {
        System.out.print("Multi-level inheritance example \n");
    }
    void input1()
    {
        System.out.print("Value of X is \t:"+x+"\n");
    }
}
class num2 extends num1
{
    int y = 30;
    void input2()
    {
        System.out.print("Value of Y is \t:"+y+"\n");  
    }
}
class total extends num2
{
    void DisplayTotal()
    {
        System.out.print("Sum of X and Y is:\n"+(x+y));
    }
}
class inheritance{
    public static void main(String[] args)
    {
        total object = new total();
        object.input1();
        object.input2();
        object.DisplayTotal();
    }
}

*/


                //                      hierarchical  inheritance example 

/*
class num1
{
    int x = 50;
    num1()
    {
        System.out.print("hierarchical  inheritance example \n");
    }
    void input1()
    {
        System.out.print("Value of X is from Num1 class  \t: "+x+"\n");
    }
}
class num2 extends num1
{
    int y = 30;
    void input2()
    {
        System.out.print("Can't Acessed by Object of Access class.");  
    }
}
class Access extends num1
{
    void DisplayTotal()
    {
        System.out.print("Value of X is from Access class \t: "+x+"\n");
    }
}
class inheritance{
    public static void main(String[] args)
    {
        Access object = new Access();
        object.input1();
        // now this time we can't aacess fxn of num2 class using Access object.
       //  object.input2();
       // we have create new object for it.
        object.DisplayTotal();
    }
}
*/