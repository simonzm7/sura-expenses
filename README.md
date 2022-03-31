# PRUEBA TECNICA SURA
**SPRING BOOT - GRADLE - ARQUITECTURA HEXAGONAL**

# VERSIONES
**Spring Boot: 2.6.5**
**OpenJDK (Temurin): 11**

# FUNCIONAMIENTO
_El backend se encuentra desarrollado bajo una arquitectura orientada al dominio, en este caso la Arquitectura Hexagonal, el servidor encuentra construido en Spring Boot y hace hace uso de JPA para realizar una integración hacia la base de datos. Los principales patrones de la arquietctura son el CQRS(Nos permite dividir la aplicación en diferentes partes una para consulta y otra para persistencia de datos), el segundo es la inyección de dependencias la cual nos permitira una facil escalabilidad de la aplicación a futuro sin afectar los modulos de esta._

**ENDPOINTS**

1. ...:3000/api/employee -> METODO POST -> Permitira almacenar el empleado y su lista de gatos de viaje
2. ...:3000/api/employee -> METODO GET -> Permitira obtener el total de gastos para los todos los empleados, la lista de estos empleados por mes y sus gastos y lo que debe asumir sura segun sea el caso.

# ¿COMO EJECUTAR?
1. _Una vez clonado el repositorio abrir el archivo buid.gradle, este será el encargado de instalar todos los archivos necesarios haciendo uso de Gradle_
2. _Para configurar la conexion a la base de datos, dirigirse a la carpeta src/main/resources/application.yml. Una vez configurada e inicializada la conexion a la base de datos, el paquete FlyWay se encargara de ejecutar las migraciones correspondientes._
3. _El puerto de escuchar se encuentra apuntando hacia el 3000, configurable desde application.yml. La ruta para comunicarse con la API debe ser antecedida por el prefijo /api/_

# Tecnologias
1. Spring Boot
2. Spring Data JPA
3. Lombock
4. FlyWay Migration
5. PostgreSQL Driver
6. JUnit




