## Examen de Test Unitarios

---

### Enunciado

Con el código de este repositorio realiza:

- (*4 puntos*) Los test unitarios de los **dos** métodos, utiliza test **parametrizados**. Suponiendo que la `string` DNI, siempre es un DNI válido.
- (*2 puntos*) En el código, hay un error, ¿lo pudiste comprabar en los test? ¿Plantea la solución?
- (*3 puntos*) Si no hubiera una comprobación previamente encuanto a la longitud de la `string` del DNI, ¿Qué hay que cambiar en los tests para que comprueben estos casos?

Entrega tu repositorio con el código y los test. Además un `Readme` explicando y justificando cada apartado

Formato del `Readme` *1 punto*

---

 ## **Pruebas Unitarias de los Métodos**

## 1- Crear el archivo

Creamos una carpeta llamda test e incluimos un fichero MainTest.java y ahi escribimos el código con junit

## 2- correr los test

corremos los test y nos damos cuenta de que el método comprobarDNI no realiza ninguna validación de la longitud ni del formato del DNI. Esto puede causar fallos si el DNI tiene más o menos de 8 caracteres o si contiene caracteres no numéricos.

## 3- Solución propuesta

Añadir una validación al método comprobarDNI para asegurarse de que el DNI tenga exactamente 8 caracteres y que solo contenga números. En caso de que el DNI no cumpla estas condiciones, el método devolverá false y mostrará un mensaje de error.

## 4- Cambios para que los test comprueben estos casos

los tests deberían incluir pruebas adicionales para verificar los siguientes casos:

Casos con un DNI de longitud incorrecta:

DNI más corto o más largo de 8 caracteres.
Casos donde el DNI contenga caracteres no numéricos.
Casos con entradas no válidas:

Casos con un DNI que contenga caracteres no numéricos.
Casos con un DNI vacío o nulo.

