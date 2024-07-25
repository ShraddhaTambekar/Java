/*
Concurrent pacakege version 1.5
 Thread pool and task as managed by ThreadPoolExcecutors
 1)Executors is class(Alos called as base class) and Executor is Runnable(Also called as base interface)
 2)ExecutorService interface(Manager) it is child of Executor interface...............interface cannot implement class
 3)Abstract ExecutorService class ...it is child of Executor Service interface
 4)ThreadPoolExecutor is child of Abstract ExecutorService class
 5)most used class is ThreadPoolExecutor
 6)we know thread will run in run method of thread class and runnable interface...
 7)To manage thread we use execute method ..but execute named method has parameter Runnable thats why we should only implement runnable interface
 8)we cannot extends thread class bcz execute parameter is runnable else it will give error
 9) before 1.5 version normal multitheardig was there ,from java 1.5 java included concurrency pacakage (import java.util.concurrent.*;) all executors class and interface are present their 
 10) in util pacakage when we do * star only class files are accessible not folder ...concurrent is folder in util 
 11)to access executors we should do - import java.util.concurrent.*;
 
 
 
Executors class (helps to create thread pool)(if we do ClassName.method(parameter) it will help us to create thread pool)
  it has multiple static method that help to create theard pool 
  when we write thread task in run and use executor to create theard pool method to create thread and give parameter for how many thread we want (newFixedThreadPOOl(int); method)
  if user donot know how many thread are needed that time executor call other method of it which say jitna task hoga utna thread banao(newCachedThreadPool();)
    1)ExecutorService newFixedThreadPool(int); <----most used
    2)ExecutorService newCachedThreadPool();<-----performance can decrease
    3)ExecutorService newSingleThreadExecutor();<------used

if i make 5 thread by using thread pool and we have 10 task then after first 5 thread do their work next task is assigned to it

//Threadpool reamin active even if task is done in ready to run state    

/*Till now we use to craete thread also assign task to it
   1)thats time it was complusory to override run method bcz thread should know what task is for it
   2)but here Executor is doing task assigning job 
   
*/

