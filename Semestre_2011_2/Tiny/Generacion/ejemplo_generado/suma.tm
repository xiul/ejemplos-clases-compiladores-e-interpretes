*      Compilacion TINY para el codigo objeto TM
*      Archivo: NOMBRE_ARREGLAR
*      Preludio estandar:
0:       LD       6,0(0)      cargar la maxima direccion desde la localidad 0
1:       ST       0,0(0)      limpio el registro de la localidad 0
*      -> leer
2:       IN       0,0,0      leer: lee un valor entero 
3:       ST       0,0(5)      leer: almaceno el valor entero leido en el id x
*      <- leer
*      -> leer
4:       IN       0,0,0      leer: lee un valor entero 
5:       ST       0,1(5)      leer: almaceno el valor entero leido en el id y
*      <- leer
*      -> asignacion
*      -> Operacion: mas
*      -> identificador
6:       LD       0,0(5)      cargar valor de identificador: x
*      -> identificador
7:       ST       0,0(6)      op: push en la pila tmp el resultado expresion izquierda
*      -> identificador
8:       LD       0,1(5)      cargar valor de identificador: y
*      -> identificador
9:       LD       1,0(6)      op: pop o cargo de la pila el valor izquierdo en AC1
10:       ADD       0,1,0      op: +
*      <- Operacion: mas
11:       ST       0,2(5)      asignacion: almaceno el valor para el id z
*      <- asignacion
*      -> escribir
*      -> identificador
12:       LD       0,2(5)      cargar valor de identificador: z
*      -> identificador
13:       OUT       0,0,0      escribir: genero la salida de la expresion
*      <- escribir
*      Fin de la ejecucion.
14:       HALT       0,0,0   