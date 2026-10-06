1. ¿Por qué es mejor usar private para nombre y edad en vez de dejarlos public?
2. ¿Qué ventaja ofrece un constructor con parámetros?
3. ¿Qué diferencia hay entre crear un objeto y crear una clase?
4. En el reto, ¿por qué Estudiante y Profesor heredan de Persona?

1. Porque aplica el principio de encapsulamiento en la programación orientada a objetos. Al hacerlos private, proteges los datos para que ninguna otra clase pueda modificarlos de forma indebida o directa. Esto te permite controlar estrictamente cómo se accede o se modifica la información
2. Permite inicializar el objeto con datos válidos desde el mismo momento en que se crea, ahorrando líneas de código. En lugar de instanciar un objeto vacío y luego asignarle los valores uno por uno con los setters, el constructor asegura que el objeto nazca completo y listo para usarse con sus atributos obligatorios ya definidos
3. La clase es como un plano o molde arquitectónico general No ocupa espacio físico en la memoria para almacenar datos reales, sino que define qué atributos y métodos van a tener los futuros elementos. El objeto es la materialización o instancia real creada a partir de ese plano (la casa construida). Ya existe en memoria y tiene valores propios y concretos para sus atributos
4. Porque comparten características comunes (nombre y edad) y comportamiento lógico. Aplicar herencia evita duplicar código innecesariamente en ambas clases y establece una relación jerárquica natural