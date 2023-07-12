# **Constructors in JAVA**

Constructor is a special method which is invoked automatically at the time of object creation. It is used to initialize the data members of new objects generally. 



1)Constructors have the same name as class or structure. 




2)Constructors don’t have a return type. (Not even void)





3)Constructors are only called once, at object creation.

***There can be three types of constructors in Java.***


## **1)Non-Parameterized constructor**

A constructor which has no argument is known as non-parameterized constructor(or no-argument constructor). It is invoked at the time of creating an object. If we don’t create one then it is created by default by Java.

```
class Student {
   String name;
   int age;
  
   Student() {
       System.out.println("Constructor called");
   }
}
```

## **2. Parameterized constructor :**

 Constructor which has parameters is called a parameterized constructor. It is used to provide 
different values to distinct objects. 

```
class Student {
   String name;
   int age;
  
   Student(String name, int age) {
       this.name = name;
       this.age = age;
   }
}
```
## **3. Copy constructor :**

 A Copy constructor is an overloaded 
constructor used to declare and initialize an object from another object. There is only a user defined copy constructor in Java

```
class Student {
   String name;
   int age;
  
   Student(Student s2) {
       this.name = s2.name;
       this.age = s2.age;
   }
}
```


**NOTE**

Note : Unlike languages like C++, Java has no Destructor. Instead, Java has an efficient  garbage collector that deallocates memory automatically.



