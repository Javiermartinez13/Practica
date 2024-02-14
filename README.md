Estimación de Pi mediante Método de Montecarlo en Java
Este proyecto en Java implementa una aplicación simple para estimar el número Pi utilizando el método de Montecarlo. El código se organiza en dos clases principales: Matematicas y Principal.

Clase Matematicas
Método generarNumeroPi
El método generarNumeroPi toma un parámetro pasos, que representa el número de puntos generados aleatoriamente. Utiliza el método de Montecarlo para estimar Pi, generando puntos aleatorios en un cuadrado unitario y contando cuántos caen dentro de un círculo inscrito. La relación entre los puntos dentro del círculo y el total de puntos generados se utiliza para calcular una aproximación de Pi.

Método main en la Clase Matematicas
El método main proporciona un ejemplo de cómo usar el método generarNumeroPi. Se configura un número predeterminado de pasos (en este caso, 100,000), pero este valor puede ajustarse según las necesidades del usuario.

Clase Principal en el Paquete Aplicacion
La clase Principal en el paquete aplicacion contiene un método main que imprime la estimación de Pi utilizando el método de la clase Matematicas. Se espera que el usuario proporcione el número de pasos como un argumento de línea de comandos al ejecutar el programa.

Ejecución del Programa
Para ejecutar el programa y obtener una estimación de Pi, se debe proporcionar el número de pasos como argumento. Un ejemplo de ejecución sería:


java aplicacion.Principal 100000
Esto imprimirá en la consola la aproximación de Pi después de realizar la simulación de Montecarlo con 100,000 pasos. El usuario puede ajustar este valor según sus necesidades para obtener una mayor precisión, teniendo en cuenta que valores más altos pueden requerir más tiempo de ejecución.

Esperamos que esta implementación y la estructura del proyecto sean útiles para aquellos interesados en comprender y aplicar el método de Montecarlo para estimar el número Pi.
