

# SoilProperties 2000

## Integrantes

<Complete la siguiente tabla>

| Nombre | Github nickname |
|--------|-----------------|
|Catalina Garcia|[@catabeek](https://github.com/catabeek)|
|Jaime Oviedo|[@jaoviedoc](https://github.com/jaoviedoc)|

## Introducción.

En campo se encuentra una variedad de suelos que dependiendo del lugar y del material  del que se formaron, varían sus características (Aguilar et ál, 2014); la determinación de estas es importante para tomar decisiones adecuadas en torno a un proyecto que se piense ejecutar en el lugar. 

De acuerdo a las propiedades generales, físicas y químicas encontradas al momento de hacer un muestreo de suelos, estos se pueden agrupar por la semejanza de las mismas, permitiendo resolver multitud de problemas sencillos.

El sentido de este trabajo es presentar un software que se desarrolló durante el segundo semestre de 2017, que posibilita almacenar la información de determinado estudio de suelos para ser compartida entre la comunidad y obtener un beneficio colectivo en pro del desarrollo del país. 

## Problemática

Al realizar un estudio de suelos se cuantifican ciertas características del mismo, pero su correcta interpretación y almacenamiento para la posterior descripción de las propiedades, puede llegar a ser engorrosa debido a la cantidad de variables manejadas.

## Marco teórico

La descripción detallada de los suelos se hace en base a la clasificación realizada por el [departamento de agricultura de los estados unidos (USDA)](https://www.nrcs.usda.gov/Internet/FSE_DOCUMENTS/nrcs142p2_051546.pdf) quien ha determinado varios parámetros o requerimientos básicos necesarios.

La implementación de la selección del color del suelo se realizó en base a la tabla [munsell](http://www.edafologia.net/programas_suelos/practclas/abcsol/comun/munsells.htm)

Otra herramienta a emplear son las presentaciones que se han abarcado en la clase “[suelos agrícolas](https://sites.google.com/unal.edu.co/ingenieril)” en la que que el grupo es asistente.

Algunas de las páginas empleadas para definiciones e información general fueron las siguientes:

* Jiménez J. [Clase de química 1](http://javierjimenez302.blogspot.com.co/2012/12/suelo-se-le-denomina-sueloal-elemento-o.html), Distrito Federal, México 2012.
* Ángeles C. [Identificación de Alófono del suelo](https://es.slideshare.net/kryzdfragg/practica-alofano). Universidad de Ciencias y Artes de Chiapas, 2010.
* León R. [Carbonatos del suelo: Curso de Diagnóstico de Suelos en Campo](http://www.madrimasd.org/blogs/universo/2007/05/01/64693). Madrid Blogs, 2007.
* Ciancaglini N. [Guía para la determinación de textura de suelos por método organoléptico](http://www.prosap.gov.ar/Docs/INSTRUCTIVO%20_R001_Guía%20para%20la%20determinación%20de%20textura%20de%20suelos%20por%20método%20organoléptico.pdf), 2016.

## Antecedentes

Se encontraron 2 software luego de indagar sobre la clasificación de suelos.

 1.	“Development of software for the classification of soils” Trabajo realizado por Aguilar A, Figueras M.A, Quezada L.E, 2014.
 
Este software brinda a los usuarios una clasificación según SUCS (Sistema Unificado de Clasificación de Suelos) la cual brinda un nombre de grupo que describe al suelo genéricamente,  junto con el símbolo del grupo respectivo. Dicho símbolo de grupo consiste en un prefijo que designa la composición del suelo (grueso o fino) y un sufijo que enfatiza sus propiedades (graduación y plasticidad) (Aguilar et ál, 2014). Por lo que esta clasificación se basa solamente en la textura del suelo, una propiedad de tantas que el mismo posee.

 1.	[GGU – STRATIG](http://www.ggu-software.com/software/ggu-field/stratig/ggu-stratig_s.html):Software diseñado en Alemania y distribuido por CivilServe software.
 
Programa para el análisis de resultados y representación gráfica de datos obtenidos en exploraciones del suelo con diferentes métodos de perforación.  La licencia es paga: 2.670,00 €  o 1.780,67 €, este último precio es por ser una licencia monoplaza ([floating licensing]( https://en.wikipedia.org/wiki/Floating_licensing)), es decir aquella en donde un número limitado de licencias para el software es compartido por un gran número de usuarios a lo largo del tiempo y administrado por un servidor central de licencias. 

## Objetivos

### General

Describir las características generales (propiedades físicas y químicas) que posee un perfil de suelo, previamente analizado por el usuario. 

### Específicos

* Permitir el registro de cualquier persona mediante la asignación de un usuario.
* Almacenar de los datos ingresados por parte del usuario.
* Facilitar el acceso a la información proporcionada para posteriores modificaciones o revisión de otro usuario.
 

## Requisitos

El lenguaje empleado por su practicidad para implementar la interfaz gráfica es Java. Las librerias empleadas en el desarrollo del programa fueron:

* Javax.swing Se usa para la parte de ventana, botones presentes en el formulario y ventanas emergentes.
* Java.sql . Empleada para resultados de búsqueda 
* Java.util. Muestra errores de login o de paso de ventana.
* Java.text. Empleado para seleccionar de la variable calendario la fecha del sistema.

La aplicación guarda datos y permite su posterior modificación y revisión para análisis.

