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
