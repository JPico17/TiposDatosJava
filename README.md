# TIPOS DE SATOS JAVA

## JAVA VIRTUAL MACHINE (JVM)

* Realiza una gestion eficiente de la memoria.
* Distribuye la memoria en dos zonas: Stack(Pila) y heap(Monton)

![RAM](ram.jpeg)

### STACK
* Se almacenan: variables locales, llamadas a metodos (parametros y resultados), variables primitivas, referencia a objetos del heap.
* Memoria estatica.

### HEAP
* Gestionado por el Garbage collector.
* Espacio de memoria en tiempo de ejecucions donde se registran los objetos.
* Memoria dinamica.
* No posee estructura de asignacion de espacios.

### VARIABLE
* Contenedor de memoria donde se almcena informacion.
* En java se declaro por un tipo que se conservara durante todo suciclo de vida en el inerior de la app.
* La variable debe tener un nombre.
* Existen de tipo primitivo y referenciado.

## PRIMITIVOS 
* Contenedores de tamaño especifico que almacenan valores y no tienen metodos.
* Ejemplo: boolean, char, byte, short, long, float, double.

## REFERENCIADOS
* Almacenan las referencias a los datos.
* Estos datos se escriben en una zona de memoria llamada heap.