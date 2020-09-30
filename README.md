# design_mode
> 23 design modes
>
the basic elements needed for understanding one design mode :
1. what is the problem it solves ?
2. how to solve ?
3. how is the solving effect ?
## singleton
> restrict the creation of only one object
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
 
## factory
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
> there are 3 roles in memento model:
> 1. originator: the object to be saved.
> 2. memento: the saved data.
> 3. caretaker: the container of dates of different memento version.
> 
> the object can generate and recover from a memento by itself. 