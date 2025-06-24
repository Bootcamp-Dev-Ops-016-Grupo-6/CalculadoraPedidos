## Preguntas finales:

¿Qué te ayudaron a identificar las pruebas unitarias?

Ayudó a detectar que la lógica de cada caso de uso en la función diera los resultados esperados correctamente y por lo tanto a comprobar el buen funcionamiento de los mismos.

¿Cuál fue el beneficio de usar un mock para simular una dependencia?

No necesitan un entorno para que corran, al centrarse en elementos unitarios no dependen de factores externos que cambien su funcionamiento, al definirse un resultado concreto en cada test se pueden crear múltiples casos de uso con los resultados esperados.

¿Qué pasaría si se modifica la lógica de descuentos sin actualizar las pruebas?

Daría un error; ya que, los test de descuento están ajustados a los casos de descuentos fijados anteriormente, si se cambia ese valor sin actualizar la pruebas que involucren esos porcentajes no servirían para evaluar correctamente los nuevos casos y por lo tanto no pasarían las pruebas.

¿Cómo escalamos esta estrategia para un sistema más grande?

Es necesario el uso de buenas prácticas que permitan un escalado que no dificulte su mantención en el tiempo:
 * Tener una buena estructura y organización de los distintos test con nombres claros y descriptivos separando tests unitarios de integración..
 * Ejecución de los test automáticamente con CI/CD.
 * Refactorización de los test junto con los códigos
 * Revisar periódicamente tests obsoletos.


## Test passed
![alt text](<images/pruebas passed.png>)

## Pipeline check
![alt text](<images/pipeline check.png>)

### Aprendizajes del equipo en este ejercicio
Este ejercicio sirvió para comprender de mejor manera el funcionamiento de las pruebas unitarias, la forma en que pueden ayudar a probar funcionalidades de forma rápida y sencilla, además de profundizar en el concepto de mockear pruebas y su utilidad a la hora del testeo, pudiendo replicar servicios externos sin necesidad de conectarse realmente a ellos.

