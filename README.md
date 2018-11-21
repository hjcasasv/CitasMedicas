# CitasMedicas
Repositorio para la materia Taller de productividad basada en herramientas tecnológicas

## Tabla de contenidos
* Descripción
* Problema identificado
* Solución
* Arquitectura
* Puede acceder a la wiki en el siguiente enlace https://goo.gl/ps1EVH o en la barra superior en el boton Wiki

## Descripción
El proyecto consiste en una aplicación para dispositivos android desarollada en java en la cual, el cliente pueda tener un listado de sus proximos eventos en su calendario al igual como un pequeño espacio para notas rapidas, dicha información estaria respaldada de forma local en el dispositivo y de forma remota en los servidores de Google.

## Problema identificado
El problema que se logro identificar al inicio del proyecto fue que mi cliente usaba agendas fisicas y hojas tipo "post-it" para lo que es el control de sus citas y/o notas las cuales al ser en papel quedan suceptibles a cualquier daño fisico con el cual podria llevar a una perdida de información ya sea de las citas registradas y/o de las notas pegadas en la misma.

Invitamos al cliente a migrar a los entornos digitales nativos que ofrece su smartphone pero nos indico que no son del todo de su agrado ya que es mezclar su vida personal con la laboral y no estaba de acuerdo en ello.

## Solución
Debido a que nuestro cliente no queria usar los entornos digitales nativos que ofrece su smartphone la solución fue crear una aplicación en la cual pueda tener de forma independiente su agenda laboral al igual que sus notas con la garantia de que toda su información quedaria respaldada de forma local en su dispositivo y en la nube usando los servidores de Google.

## Arquitectura


## Instalación

Para la correcta realizacion de este repositorio se instalaron los siguientes componentes:

+ JDK 8 en la version mas reciente (en este caso fue la 172 para windows x64)

+ GitHub para escritorio o Git en linea de comando

+ Un IDE con el cual podamos manejar el repositorio de GitHub (en este caso usaremos AndroidStudio)

Para la instalación de la aplicación se puede clonar el repositorio e importarlo para obtener el archivo APK o descargar directamente el archivo APK en la sección de "Relase" de la barra superior o en siguiente enlace https://goo.gl/9vQpJ7.

**Instalación usando codigo fuente** 
+ **Clonar el repositorio**  
```
git clone https://github.com/hjcasasv/CitasMedicas.git
```
+ **Importar a AndroidStudio**  
1. Dar clic en `File -> Open`.
2. Se deberá seleccionar la carpeta donde está el proyecto ya clonado.

+ **Exportar .APK**  
1. Dirigirse a la barra de herramientas de AndroidStudio.
2. Dar click en `Build -> Generate Signed APK`.
3. Crear nueva llave para firmar el APK `Create New` o usar una llave ya existente `Choose existing`.
4. Dar click en `Next` para seleccionar la carpeta de destino y si se producira APK final o en estado Beta.
5. Seleccionar *V2 Full APK Signature*.
6. Dar click en `Finish`.

+ **Ejecutar .APK**  
1. Abrir la carpeta previamente seleccionada y copiar el archivo APK en el dispositivo android en el cual se instalara la aplicación.
2. Abrir el archivo APK directamente en el dispositivo android (*habilitar fuentes desconocidas antes de abrir el archivo*).
3. Tocar `Abrir` al finalizar la instalación del archivo APK en el dispositivo android.

## Uso

Esta sección se actualizara junto con la entrega final del mismo.

## Créditos

Hector Casas (hjcasasv) -- Creador de este repositorio y alumno de la materia Taller de productividad basada en herramientas tecnológicas

Dra. Valencia -- Cliente para el cual se realiza el proyecto

## Licencia

Este repositorio fue creado bajo la licencia de MIT License. Para mayor informacion acerca de la licencia ir al archivo LICENSE.
