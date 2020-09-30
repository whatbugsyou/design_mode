# design_mode
> 23 design modes
>
the basic elements needed for understanding one design mode :
1. what is the problem it solves ?
2. how to solve ?
3. how is the solving effect ?
## singleton
  - the lazy mode: create when use
    - static inner class
    - DCL: double-checked lock
  - the hungry mode: create when load
    - static init

## prototype
 - simple 
 - manager
 
## factory
## flyweight
> reuse objects to reduce the operation times of `new`, 
> if we need objects of the same class and only properties are 
> different ,even the same.  
> the flyweight model always keeps a `Map` of objects ,
>`new` for the first time and saves it, returns the reference after.  