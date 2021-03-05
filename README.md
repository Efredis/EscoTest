
# EscoTest :tw-1f4cb:
Las pruebas automatizadas llamadas "EscoTest" cumple con las siguientes premisas:

Realizar 3 (tres) pruebas de navegabilidad de categorías de MercadoLibre validando:
a.	El título de la categoría accedida
b.	Que se muestre el total de resultados. 

Se ejemplifican categorías validas resaltando los tres niveles de navegación:

●	Categorías - Hogar y Muebles - Jardín
●	Categorías - Tecnología - Celulares y Smartphones
●	Categorías - Belleza y Cuidado Personal - Ojos 

## Pre-requisitos: :tw-1f4d4:

- SO: Windows 7 ó posterior.
- Procesador: Intel from 1.2 GHz ó equivilent AMD family.
- Memoria: 4 GB de RAM.
- Gráficos: DirectX 9 compatible Tarjeta gráfica card.
- DirectX: Versión 9.0.
- Almacenamiento: 1 GB de espacio disponible.

Para ejecutar las pruebas es necesario configurar un entorno que comprende lo siguiente:

- Se requiere instalar la aplicación Eclipse IDE for Java Developers., lo puede descargar desde la url: https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2020-12/R/eclipse-java-2020-12-R-win32-x86_64.zip.
- Se requiere instalar el navegador Google Chrome.
- Se requiere descargar e instalar la aplicación Java Platform (JDK) 8u111 / 8u112, desde la web: https://www.oracle.com/technetwork/es/java/javase/downloads/index.html
- Se requiere configurar las variables de entorno, de la siguiente manera:

### Windows 10 y Windows 8
- En Buscar, busque y seleccione: Sistema (Panel de control)
- Haga clic en el enlace Configuración avanzada del sistema.
- Haga clic en Variables de entorno. En la sección Variables del sistema busque la variable de entorno PATH y selecciónela. Haga clic en Editar. Si no existe la variable de entorno PATH haga clic en Nuevo.
- En la ventana Editar la variable del sistema (o Nueva variable del sistema), debe especificar el valor de la variable de entorno PATH, que sería:
	Nombre de la Variable: JAVA_HOME
	Valor de la Variable: Ruta donde se instaló el java, por ejemplo: C:\Program Files\Java\jdk-15.0.2.
- Haga clic en Aceptar. Cierre todas las demás ventanas haciendo clic en Aceptar.
- Haga click en el boton de inicio, buscar "CMD" y ejecute el comando: "java -version", esto le traerá la versión del java indicando a su vez que está instalado.

### Windows 7
- Desde el escritorio, haga clic con el botón derecho del mouse en el icono de la computadora.
- Seleccione Propiedades en el menú contextual.
- Haga clic en el enlace Configuración avanzada del sistema.
- Haga clic en Variables de entorno. En la sección Variables del sistema busque la variable de entorno PATH y selecciónela. Haga clic en Editar. Si no existe la variable de entorno PATH haga clic en Nuevo.
- En la ventana Editar la variable del sistema (o Nueva variable del sistema), debe especificar el valor de la variable de entorno PATH, que sería:
	Nombre de la Variable: JAVA_HOME
	Valor de la Variable: Ruta donde se instaló el java, por ejemplo: C:\Program Files\Java\jdk-15.0.2.
- Haga clic en Aceptar. Cierre todas las demás ventanas haciendo clic en Aceptar.
- Haga click en el boton de inicio, buscar "CMD" y ejecute el comando: "java -version", esto le traerá la versión del java indicando a su vez que está instalado.

### Ejecutando las pruebas: :tw-1f4dd:
Una vez configurado el entorno para las pruebas y descargar el repositorio, se debe realizar lo siguiente para su ejecución: 

- Ejecutamos el eclipse.
- Clic al menu "File".
- Clic en "Open Projects from file system..."
- Clic en Directory y selecionar la carpeta "EscoTest" descargada desde el repositorio.
- Una vez visualizado el proyecto en el explorador de eclipse, seleccionar el proyecto y hacer clic al menú "Run" - "Run As" - "2 JUnit Test".

Luego de todo este procedimiento se ejecutarán las pruebas requeridas.