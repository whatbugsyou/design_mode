# design_mode
> 23 design modes
>
the basic elements needed for understanding one design mode :
1. what is the problem it solves ?
2. how to solve ?
3. how is the solving effect ?

## singleton
> Restrict to instantiate only one object
  - the lazy mode: create when use
    - static inner class
    - DCL: double-checked lock
  - the hungry mode: create when load
    - static init

## prototype
> use `clone()` to reduce the time cost of `new`,
> if `new` is a time costing progress ,it helps a lot.
>
> the `clone()` of `Object` is shallow copying,
> if deep copying is needed , overrides `clone()` with 
> the Object IO stream and implements `Serializable` 
 - simple 
 - manager

## simple factory
> Give the factory different key to create different objects that implements the same interface.
> the factory need to know all the key and its Corresponding object's creation.
> the key is hardCode, and it is hard to maintain when the key set is gradually bigger.


## factory method
> the factory create an object implementing the interface, but do not expose the specific type of the object.
> so we can update or change the return type and the client is insensible.
> the shortcoming is that it needs to define factory for every product.

## abstract factory
> create a series objects, that are from the same platform or have some reason stick them together.
> the client only need to create the right factory, do not have to know the real type the factory creates.


## flyweight
> reuse objects to reduce the operation times of `new`, 
> if we need objects of the same class and only properties are 
> different ,even the same.  
> 
> the flyweight model always keeps a `Map` of objects ,
>`new` object for the first time and saves it in the `Map`, 
> returns the reference after.  

## memento
> save one object's status and recover after.
>
> there are 3 roles in memento model:
> 1. originator: the object to be saved.
> 2. memento: the saved data.
> 3. caretaker: the container of dates of different memento version.
> 
> the object can generate and recover from a memento by itself. 

## observer
> one object changed, notify the other objects. 1 to N
>
> there are 2 roles in observer model:
> 1. observable: as part  "1"
> 2. observer: as part "N"
>
> the observable maintains a list of observers,
> and when it comes to changing something in the observable, 
> the observable will notify all the observers in the list in order
> of the changes by a call to their `update` method with 
> the args of the changed data or the references of itself. 

## decorator
> decorator **enriches** methods of an existing class.
> `IO stream` and `Buffered IO stream` is a paradigm of the model.
>
> the decorator and the origin class implement the same interface
> which contains the methods to be enriched. the decorator maintains
> an object of the origin class, and override the methods in interface 
> with a call of methods of origin and other code of enriching operation.

## delegate
> make better **controlling** of the origin object or add some self operations 
> when calling the delegated method.
>
> One thought: Now I have a super talent coder and nobody knows him.
> Everyone can contact me and propose product requirements,even if I
> do not know coding, but I can make it perfectly with the talent .
> In this case, I am the delegator of him. 
>
> the code implements of delegate model are most similar to decorator model,
> but still have differences in encapsulation. 

## chain of responsibility
> if one request or message will be handled with multiple receivers,
> string the receivers into a chain, and make the chain a replacer 
> of the receivers and as a filter of the request.

## mediator
> reduces the complexity of communicating between multiple objects 
> that communicate by referencing to each other, and will simplify 
> the communication mode from "N to N" to "N to 1 to N".

## builder
> separate the construction and representation of object.it means 
> a new way to creat an object other than the normal flow as 
> `new constructor(arg1,arg2)`,and the representation of an object
> could be more clear and readable for code --- no setter and a 
> string of args when the object is complicated.

## adapter
> turn the implementation of an interface into another interface's.

## template method
> extract the method of subclasses that have the same logic into their
> super class and modifies with `final`.

## facade
> combines the classes extend from the same super abstract class or implement 
> one same interface into a class ,and exposed methods for calling the origin 
> methods of them.

## bridge
> use a composition relationship replaces an inheritance relationship to reduce 
> the coupling between objects.

## null object
> use an empty object to replace the real `Null` object, providing default properties
> and method body. 

## criteria
> also known as filter model.use different criteria which can be easily combined 
> with logical to filter a list of object.