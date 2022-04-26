# TIPOS DE SATOS JAVA

## JAVA VIRTUAL MACHINE (JVM)

* Realiza una gestion eficiente de la memoria.
* Distribuye la memoria en dos zonas: Stack(Pila) y heap(Monton)

![RAM](/modelo/ram.jpeg "RAM")

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
* Accesible desde otras instancias de clase.
* Su ciclo de vida termina cuando no se necestia más.
* Mientras exista almenos una referencia activa en la zona de datos esta se mantendra.
* Tan pronto como no haya mas referencia, la zona se consiodera noutilizada y se procede a su destruccion por parte del Garbage Collector.
* Un tipo referenciado puede no refrenciar nada --> null
* new: intanciacion de una clase.  Osea reserva una direccion de un area de memoria.

## VARIABLE DE REFERENCIA
* Caracteriza una instancia de clase, es decir la direccion donde esta el onjeto.
* Contiene la direccion de un objeto, cuyo valor por defecto es null.
* Durante una prueba e igualdad entre dos variables por referencia, son las dirrrecciones de los objetos lo que se compara, y no el contenido de los objetos en si mismo.
* Cuando se usa una referencia como argumento de un método es la direccion del obejto lo que se pasa, y no el objeto en si mismo.