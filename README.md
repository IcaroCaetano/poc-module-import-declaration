# poc-module-import-declaration

## Objetivo 

- Melhorar a experiencia do desenvolvedor
- Evitar Boilerplate 
- Codigo mais limpo
- Menos manutencao de imports

## Antes 

````java
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
````

ou com Wildcard

````java
import java.util.*;
````

No Java 25, podemos importar um módulo inteiro.

````java
import module java.base;
````

Como descobrir todos os módulos e seus pacotes?
Você pode executar:

````
java --list-modules
````

## Exemplo de Modulo:

### O que o java.base abrange?

````java
java.lang
````
#### Linguagem e objetos básicos

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
