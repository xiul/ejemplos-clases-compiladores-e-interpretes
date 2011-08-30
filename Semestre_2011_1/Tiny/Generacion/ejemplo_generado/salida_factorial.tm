
*      Compilacion TINY para el codigo objeto TM
*      Archivo: NOMBRE_ARREGLAR
*      Preludio estandar:
0:       LD       6,0(0)      cargar la maxima direccion desde la localidad 0
1:       ST       0,0(0)      limpio el registro de la localidad 0
*      -> leer
2:       IN       0,0,0      leer: lee un valor entero 
3:       ST       0,0(5)      leer: almaceno el valor entero leido en el id x
*      <- leer
*      -> if
*      -> Operacion: menor
*      -> constante
4:       LDC       0,0(0)      cargar constante: 0
*      <- constante
5:       ST       0,0(6)      op: push en la pila tmp el resultado expresion izquierda
*      -> identificador
6:       LD       0,0(5)      cargar valor de identificador: x
*      -> identificador
7:       LD       1,0(6)      op: pop o cargo de la pila el valor izquierdo en AC1
8:       SUB       0,1,0      op: <
9:       JLT       0,2(7)      voy dos instrucciones mas alla if verdadero (AC<0)
10:       LDC       0,0(0)      caso de falso (AC=0)
11:       LDA       7,1(7)      Salto incodicional a direccion: PC+1 (es falso evito colocarlo verdadero)
12:       LDC       0,1(0)      caso de verdadero (AC=1)
*      <- Operacion: menor
*      If: el salto hacia el else debe estar aqui
*      -> asignacion
*      -> constante
14:       LDC       0,1(0)      cargar constante: 1
*      <- constante
15:       ST       0,1(5)      asignacion: almaceno el valor para el id fact
*      <- asignacion
*      -> repeat
*      repeat: el salto hacia el final (luego del cuerpo) del repeat debe estar aqui
*      -> asignacion
*      -> Operacion: por
*      -> identificador
16:       LD       0,1(5)      cargar valor de identificador: fact
*      -> identificador
17:       ST       0,0(6)      op: push en la pila tmp el resultado expresion izquierda
*      -> identificador
18:       LD       0,0(5)      cargar valor de identificador: x
*      -> identificador
19:       LD       1,0(6)      op: pop o cargo de la pila el valor izquierdo en AC1
20:       MUL       0,1,0      op: *
*      <- Operacion: por
21:       ST       0,1(5)      asignacion: almaceno el valor para el id fact
*      <- asignacion
*      -> asignacion
*      -> Operacion: menos
*      -> identificador
22:       LD       0,0(5)      cargar valor de identificador: x
*      -> identificador
23:       ST       0,0(6)      op: push en la pila tmp el resultado expresion izquierda
*      -> constante
24:       LDC       0,1(0)      cargar constante: 1
*      <- constante
25:       LD       1,0(6)      op: pop o cargo de la pila el valor izquierdo en AC1
26:       SUB       0,1,0      op: -
*      <- Operacion: menos
27:       ST       0,0(5)      asignacion: almaceno el valor para el id x
*      <- asignacion
*      -> Operacion: igual
*      -> identificador
28:       LD       0,0(5)      cargar valor de identificador: x
*      -> identificador
29:       ST       0,0(6)      op: push en la pila tmp el resultado expresion izquierda
*      -> constante
30:       LDC       0,0(0)      cargar constante: 0
*      <- constante
31:       LD       1,0(6)      op: pop o cargo de la pila el valor izquierdo en AC1
32:       SUB       0,1,0      op: ==
33:       JEQ       0,2(7)      voy dos instrucciones mas alla if verdadero (AC==0)
34:       LDC       0,0(0)      caso de falso (AC=0)
35:       LDA       7,1(7)      Salto incodicional a direccion: PC+1 (es falso evito colocarlo verdadero)
36:       LDC       0,1(0)      caso de verdadero (AC=1)
*      <- Operacion: igual
37:       JEQ       0,-22(7)      repeat: jmp hacia el inicio del cuerpo
*      <- repeat
*      -> escribir
*      -> identificador
38:       LD       0,1(5)      cargar valor de identificador: fact
*      -> identificador
39:       OUT       0,0,0      escribir: genero la salida de la expresion
*      <- escribir
*      If: el salto hacia el final debe estar aqui
13:       JEQ       0,27(7)      if: jmp hacia else
*      <- if
*      Fin de la ejecucion.
41:       HALT       0,0,0      
