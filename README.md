# master

Synchronization is good option for locking data but not always .
it doesn't come free it's has a certain overhead . There is a mater of performance hit which we really don't see .

it's effect performance also , synchronized method can slow down your program because it restricts concurrency .
In other hand , a synchronized method forces other threads to wait .

it's always a good option to use bare minimum option code under synchronization 









Collection in Java :
TreeSet :
keeps the elements sorted and prevents duplicate 

HashMap :
store and access the element as name/value pair 


LinkedList 
Designed to give better performance in time of you insert and delete element form middle of the collection 


HashSet :
Prevents duplicate and better to help in time of finding the elements 


LinkedHashMap
Like regular HashMap we can insert elements in key/value pair but it can mantain insertion order .











🤡Learing Generics
Dozens of things we can learn from Generics but there is mainly three where we will be focusing 

Creating instances og generified classess like ArrayLis:
that means when we will be creating arrayList we have to tell which type of Object we gonna allow for this perticular list .
new ArrayList<Song>();
  
  
  Declaring and assigning variables of generic types 
  how does polymorphism works with generic , is it possible to assign ArrayList<Dog> when we do have reference of          ArrayList<Animal>
  
  ArrayList<Animal> arrayList = new ArrayList<Dog>();
  
  
  
  Declaring and invoking methods that take generic types 
  
  we have a method that takes parameter say as Animal is it possible to send parameter Dog there .
  
  
  
  
  
  
  











