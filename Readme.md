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


# Repositorio para pruebas del cálculo de DNI

## Descripción

Este repositorio contiene el código de una aplicación que valida si un DNI español y su letra son correctos. El código calcula la letra correspondiente a un número de DNI y la compara con la letra pasada como parámetro.

## Funcionalidades

- **comprobarDNI(String dni, char letra):** Verifica si el DNI y la letra coinciden correctamente.
- **calcularLetraDNI(String dni):** Calcula la letra correspondiente a un número de DNI.

## Tests

Se han creado pruebas unitarias para los métodos de la clase `Main` usando JUnit. Los tests son parametrizados y cubren los siguientes casos:

## 1. **Prueba de comparación DNI-letra**: Verifica si el DNI y la letra proporcionada son correctos.

![Primer test](test4.png)

## 2. **Prueba de cálculo de letra**: Comprueba que la letra calculada coincida con la esperada.

![Segundo test con error](test1.png)

### En este caso force un error y el propio IDE ya te dice el cambio que tienes que realizar para corregirlo.

![Primer test corregido](test2.png)

## 3. **Prueba de longitud del DNI**: Verifica que el DNI tenga exactamente 8 caracteres. En un principio este error estaba en el código original.

![Tercer test](test3.png)
