package Encapsulation;

class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }

}
public class Test1 
{
    public static void main(String[] args) 
    {
        Human p1 = new Human();
        p1.setAge(15);
        p1.setName("Suman Baral");

        System.out.println("Age " + p1.getAge() + " Name "+ p1.getName());

        
    }
    
}
