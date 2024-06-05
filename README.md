# practica_final_objetos
practica_final_objetos


JHAN BRANDON RIASCOS MARTINEZ
1124862723
317747474475

FUNCIONALIDADES 
El programa permite registrar 
listado de aeropuertos, 
listado de vuelos tanto si son vuelos regulares como si son vuelos charter

REPORTES
Cuenta con reportes de:
vuelos de salida de cada aeropuerto
vuelos de llegada de cada aeropuerto

CLASES
El programa cuenta con 5 clases: 
- Aeropuerto
- Compania
- Vuelos
- Vuelos_charter
- Vuelos_regular.

DESCRIPCION DE CLASES
*AEROPUERTO
Permite registrar codigo, nombre, poblacion, pais, GMT.
*COMPANIA
Permite el registro de nombre de la compania
*VUELOS 
Esta es la superclase cuenta con las variables origen, destino, plaza y duración. Además del método abstracto "mostrarDetalles".
Esta superclase obliga que las clases derivadas de ésta cuenten con las mismas variables.
Esta superclase obliga que las clases derivadas de ésta tengan que definir el método "mostrarDetalle"
* VUELOS_CHARTER
Esta clase hereda de Vuelos las mismas variables, adicionalmente permite registrar clientes y fecha_de_salida;
* VUELOS_REGULAR
Esta clase hereda de Vuelos las mismas variables, adicionalmente permite registrar horarios_de_salida;


MAIN
En la clase principal Main
Hay que crear la lista "Aeropuerto", a esta lista añadir nuevos objetos de tipo "Aeropuerto".
Hay que crear la lista "Vuelos", a esta lista añadir nuevos objetos de tipo "vuelos".
Para generar el reporte de vuelos de salida creamos dos ciclos for anidados.
En el primer ciclo for se recorre el listado de "Aeropuertos" y se imprime el nombre del aeropuerto, además se declara la variable bandera "hayVuelos" como falso.
En el segundo ciclo for se muestran los datos de los vuelos validando que compartan el mismo codigo de aeropuerto en el campo "Codigo" con el codigo del vuelo en el campo "Destino", si es asi se utiliza el metodo "mostrar detalles" y activando la variable bandera "hayVuelos" como verdadera. Si la variable bandera es negativa, es decir si "hayVuelos" es falsa se imprime "No hay vuelos de llegada a este aeropuerto"

