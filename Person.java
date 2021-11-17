public class Person
{

private String name;
private int age;
private String color;

Person(String aName, int aAge, String aColor)
{
  name = aName;
  age = aAge;
  color = aColor;

}

void setName (String theName)
{
  name = theName;
}

void setAge (int theAge)
{
  age = theAge;
}

void setColor (String theColor)
{
  color = theColor;
}

String getName()
{
  return name;
}

int getAge() 
{
  return age;
}

String getColor()
{
  return color;
}
}