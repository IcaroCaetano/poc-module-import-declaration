# poc-module-import-declaration

## Objective

- Improve developer experience
- Avoid boilerplate code
- Cleaner code
- Less import maintenance

## Before

````java
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
````
or with Wildcard

````java
import java.util.*;
````

In Java 25, we can import an entire module.

````java
import module java.base;
````

How do I find all the modules and their packages?

You can run:

````
java --list-modules
````

## Example of a Module:

### What does java.base cover?

````java
java.lang
````
#### Basic Language and Objects

Classes:

````java
String
Object
System
Math
Thread
Runtime
Class
Enum
Throwable
Exception
Error
Process
ProcessBuilder
````
#### Coleções

````java
java.util
````

Classes:
````
List
ArrayList
LinkedList
Map
HashMap
TreeMap
Set
HashSet
TreeSet
Queue
Deque
Optional
UUID
Random
Collections
Comparator
````

#### Streams

````java
java.util.stream
````

Classes:

````
Stream
Collectors
Gatherer
IntStream
LongStream
DoubleStream
````

#### Data e hora

````java
java.time
````

Classes:

````
LocalDate
LocalDateTime
LocalTime
Instant
Duration
Period
ZoneId
ZonedDateTime
````

#### Concorrência

````
java.util.concurrent
````

Classes:

````
CompletableFuture
ExecutorService
Executors
ConcurrentHashMap
Semaphore
CountDownLatch
Future
TimeUnit
````

#### Concorrência avançada

````
java.util.concurrent.atomic
````

Classes:

````
AtomicInteger
AtomicLong
AtomicBoolean
AtomicReference
````
#### I/O

````
java.io
````

Classes:

`````
File
InputStream
OutputStream
BufferedReader
BufferedWriter
Serializable
``````
