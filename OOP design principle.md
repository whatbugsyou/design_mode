# OOP design principle

## single responsibility principle

> Do one thing, and do it well.

- what is responsibility?

  responsibility is defined as a reason for change. if there has another reason for change, it not meet the principle.

- what is a reason for change?

  think about why and when the class needs to change or update itself, there should find at least one facet in related business code, the facet is the reason for change.

negative example:

```java
public class Rectangle
{
    public idoublent Height;
    public double Width;

    public double Area()
    {
        return Width * Height;
    }

    public void Draw()
    {
		//draw on GUI
    }
}
```

when include Rectangle, need include all the required dependency, such as Math and GUI related packege. but in some case, we just only want to compute area or draw a rectangle, which will waste time   in loading unused packages.

positive example:

```java
public class Rectangle{
    public double Height;
    public double Width;
}
public class GeometryRectangle extends Rectangle{
   	public double Area(){
        return Width * Height;
    }
}
public class GraphicalRectangle extends Rectangel{
    public void Draw(){
		//draw on GUI
    }
}
```

## open-close principle

> Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
>
> it sounds like tough to reach, but **Abstraction is the Key.**

it is easy to code something that is not meet the principle. such as:

```java
public static void main(String[] args){
    ...;
    for(Shape shape:shapes){
    switch(shape.getName()){
        case "circle":
            dealwithCircleShape(shape);
        case "rectangle":
            dealwithRectangleShape(shape);
        }
    }
}

```

what if name equals to "triangle" or "square"? solution :

```java
public abstract class Shape{
    public String name;
    public abstract void dealwithShape();
    //getter and setter
}
public class Circle extends Shape{ 
    @Override
    public void dealwithShape(){
        ...;
    }
}
public class Rectangle extends Shape{ 
    @Override
    public void dealwithShape(){
        ...;
    }
}
public static void main(String[] args){
    ...;
    for(Shape shape:shapes){
    	shape.dealwithShape();
    }
}
```

now, we can extension class by creating sub class of Shape and not modify the existing code.

but it is usually not completely closed when new requirements comes along. for example, we need to manage the dealing order such as Rectangle dealing before Circle. in this case, we may need to sort the shape list. there are three ways to do it:

1. sort not in Shape

   before dealing, we need to sort the shape list in main, and this code looks like temporary which is not reusable.

2. add static method orderShapeList in Shape

   ```java
   public static List<Shape> orderShapeList(List<Shape> shapes){
   	...;
   }
   ```

3. sort by TreeSet and Shape implements Comparable

   ```java
   @Override
   public int compareTo(Shape shape){
       if(this.getName().equals("circle") && shape.getName().equals("rectangle")){
           return -1;
       }else{
           return 1;
       }
   }
   ```

no matter which way we choose, the adding code is  contrary to the principle. we need to modify code in Shape when updates the rules of dealing order. 

in my opinion, when it come to expand one class ,we can replace some specific word with general word to help thinking of coding that would not be against to the principle. such as replacing "circle" with "some shape".

now, we use "Data Driven"  in Shape to meet the principle:

```java
private static HashTable<Class,Integer> table = new HashTable<>();
static{
    table.put(Rectangle.getClass,2);
    table.put(Circle.getClass,1);
}
public setTable(HashTable<Class,Integer> table){
    this.table = table;
}
public int compareTo(Shape shape){
	return table.get(this.getClass) - table.get(shape.getClass());
}
```

by doing this, we could only maintain a order table for changing the order of dealing. 

## liskov substitution principle

> Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.

negative example( RTTI（Run Time Type Identification , a curse of OOP):

```java
void DrawShape(Shape s)
{
    if (s instanceof Square)
        DrawSquare((Square)s);
    else if (s instanceof Circle)
        DrawCircle((Circle)s);
}
```

Considering a classical problem: is Square a Rectangle?

for generally thinking, the answer is yes, but in the principle maybe not. let's see:

```java
public class Rectangle{
    private double width;
    private double height;
    // setter and getter
}
public class Square extends Rectangle{
    @Override
    public setWidth(double width){
        super.setWidth(width);
        super.setHeight(height);
    }
    @Override
    public setHeight(double Height){
		super.setWidth(width);
        super.setHeight(height);
    }
}
```

everything seems to be all right, until :

```java
void func1(Rectangle r){
    r.setWidth(1);
}
```

if we send an object of Square, the object is broken. because the height is not changed.

the real reason is there have no *Polymorphism*. so we try to change the Rectangle ,which is contrary to OCP.

```java
public abstract class Rectangle{
    private double width;
    private double height;
    abstract void setWidth();
    abstract void setHeight();
}
```

what is it? i don't know. whatever,  we lose a normal class ---- Rectangle. 

no matter how we try , we still can't make it. what's the root reason? look this:

```java
void func2(Rectangle r){
    r.setWidth(5);
    r.setHeight(4);
    assert r.getWidth() * r.getHeight() == 20;
}
```

for user's opinion of view, it is easy to make an reasonable assumption that changing the width of a Rectangle would not change the height. so it works will with Rectangle. but if we send a Square to it, errors occur. 

the key is:

**square is a rectangle in our daily life, but Square Object is not a Rectangle Object in programing , because their behavior is different ,which is program design really concerned.**

when using *Polymorphism*, all of the derived classes' behavior must be consistent with their base class in user's expectation.

## dependency inversion principle

> High level modules should not depend upon low level modules. Both should depend upon abstractions.
>
> Abstractions should not depend upon details. Details should depend upon abstraction.

All well-structured object-oriented architectures have clearly-defined layers, with each layer providing some coherent set of services though a well-defined and controlled interface.

this principle is easy to be comprehended. if high level class directly depends upon low level class other than the reference of the abstract class of it or the interface it implements , it is hard to change for a new feature of low level class.

negative example:

```java
public class Copyer{
    public void copy(){
        String s = null;
        while((s=ConsoleReader.read()) != -1)	//directly depends upon low level class
            ConsoleWriter.write();	//directly depends upon low level class
    }
}
```

this class can translate the input of one console to another. maybe we could call "Copyer" "ConsoleCopyer". 

if there comes a new device that supports writing named "DiskWriter",and we want to use Copyer to translate date from ConsoleReader to it. the class Copyer may changed to:

```java
enum OutputDevice {console,disk};
public class Copyer{
    public void copy(OutputDevice dev){
        String s = null;
        while((s=ConsoleReader.read()) != -1){
            if (dev == console)
                ConsoleWriter(c);
            else
                DiskWriter(c);
        }
    }
}
```

what if there are many more devices supporting writing? we went to pieces!

positive example:

```java
public class Copyer{
    public void copy(Reader r,Writer w){
        String s = null;
        while((s=r.read()) != -1)
            w.write();
    }
}
public interface Reader{
    String read();
}
public class ConsoleReader implements Reader{
	@Override
    public String read(){
        ...;
    }
}

...
```

## interface segregation principle

> Clients should not be forced to depend upon interfaces that they do not use.

the fat interface:

```java
public interface IAnimal{
	void eat();
    void sleep();
    void walk();	//not good
}
```

look at this IAnimal interface, is it reasonable? NO. take fish for example ,it does not walk but swing. so if a fish class implements IAnimal, it must complete walk() ,that's ridiculous.

## composite reuse principle

> Favor polymorphic composition of objects over inheritance as a reuse mechanism.

when design a class or a project, we need to consider the extension efficiency.

negative example:

```java
public class Car{
    void move();
}
public class GasolineCar extends Car{
    
}
public class ElectricCar extends Car{
    
}
```

now we got a few subclass of Car, and that's easy to code.

 later we got trouble of this design. we need to create multi-energy cars and they are paint by diverse color.are we need to create class of RedGasCar, BlueSolarCar, .etc ? that's sound bad.

positive example:

```java
public class Car{
    private Color color;
    private Energy energy;
    public Car(Color color,Energy energy){
        this.color=color;
		this.energy=energy;
    }
}
public interface Color{}
public interface Energy{}
public class RedColor implements Color{}
public class SolorEnergy implements Energy{}
```

## low of demeter

> least knowledge principle

