# OOP design principle

## single responsibility principle

> Do one thing, and do it well.

- what is responsibility?

  responsibility is defined as a reason for change. if there has another reason for change, it not meet the principle.

- what is a reason for change?

  think about why and when the class needs to change or update itself, there should find at least one facet in related business code, the facet is the reason for change.

negative example:

```java
public abstract class server{ 
    void connect();		//facet of connection
    void disconnect();	//facet of connection
    void send(); 		//facet of data channel
    void reseive();		//facet of data channel
}
```

positive example:

```java
public interface Connection{
    void connect();		
    void disconnect();
}
public interface DataChannel{
    void send();
    void reseive();
}
public abstract class server implements Connection, DataChannel{}
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

## interface segregation principle

## composite reuse principle

## low of demeter

> least knowledge principle

