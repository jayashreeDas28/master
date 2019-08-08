# master

Synchronization is good option for locking data but not always .
it doesn't come free it's has a certain overhead . There is a mater of performance hit which we really don't see .

it's effect performance also , synchronized method can slow down your program because it restricts concurrency .
In other hand , a synchronized method forces other threads to wait .

it's always a good option to use bare minimum option code under synchronization 
