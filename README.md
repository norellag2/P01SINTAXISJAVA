# Sintaxis en Java

- Distingue mayúsculas y minúsculas
- Solo detecta el primer espacio en blanco
- Las instrucciones de una línea acaban obligatorimente en ;

# Variables

Sintaxis declaración
modificadorAcceso TipoDeDato identificador;
Reglas para identificadores
  - Comiencen por caracteres $ ó _
  - No pueden usar palabras reservadas
  - Buena práctica usar camelCase (a veces se usa snake_case)

# Constantes
Sintaxis declaración
final TipoDeDato IDENTIFICADOR; OBLIGATORIAMENTE LLEVA EL MODIFICADOR FINAL 
- Buena práctica o convención usar UNSERSCORE_CASE

## Tipos de Datos en Java

### Datos primitivos
i booleano, 4 númericos enteros, 2 númericos flotantes y 1 caracteres alfanuméricos

Tipo        Valor

boolean     true ó false (muy utilizado)

byte        Enteros de 8 bit
short       Enteros de 16 bit
int         Enteros de 32 bit (muy utilizado)
long        Enteros de 64 bit (el valor tendrá el sufijo L)

float       Flotantes de 32 bit (el valor tendrá el sufijo f)
double      Flotantes de 64 bit (muy utilizado)

char        Caracteres de 16 bit (valores Unicode) van con comillas simples


### Tipos Complejos
(Arrays y objetos)

Todos los complejos dependen de clases propias de Java o clases creadas por el desarrollador
Clases genéricas
- Array
- Object
