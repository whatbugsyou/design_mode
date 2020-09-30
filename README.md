# design_mode
> 23 design modes
## singleton
  - lazy mode
    - statc inner class
    - DCL: double-checked lock
  - hungry mode 
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