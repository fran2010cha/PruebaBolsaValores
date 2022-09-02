Estructura del proyecto:

•Este proyecto de backend consiste en la implementación de servicios Rest realizado con spring boot 
usando la versión de Java 11 y Maven para la gestión del proyecto, La estructura de nuestro proyecto consiste 
en obedecer la arquitectura Modelo Vista Controlador , la cual para ello tenemos un paquete de acceso a datos  
el cual llamamos dao , otro paquete de entidades en el que se encuentra nuestras entidades definidas para la 
creación de las tablas en la BD ,  paquete de services el cual tiene los servicios definidos para nuestra necesidad 
de negocio y por ultimo el paquete de controllers  que expone un servicio con método Post para realizar las 
inserciones de los eventos en la base de datos en el que se tuvo en cuenta para este proyecto el SGBD  Mysql versión 8 
y se configuro el datasource  en el archivo de aplication.properties dentro del proyecto, se usó el ORM de hibernate 
para la creación de las tablas en la base de datos partiendo de las entidades creadas en el proyecto , 
y aparte el controlador también expone un servicio con método Get para mostrar los eventos para cada plataforma 
con su respectiva información en formato JSON.

Diseño:

•La decisión de diseño que se llevó a cabo en el proyecto se tomó teniendo en cuenta principalmente la escalabilidad 
y mantenibilidad del proyecto, usando el patrón de diseño Repository que son las clases DAO encargadas de acceder a los 
datos de la BD y el patrón de diseño facade que lo usamos en las clases de servicio y solo usa los servicios definidos para 
esta necesidad de negocio, los cuales realizamos el llamado de los mismo desde el controlador.

Análisis:

•Se realizó un análisis para esta necesidad de negocio, el cual consiste principalmente en la creación de tres tablas 
o entidades que serian la de plataforma la cual nos guarda la información de la plataforma como el código  y nombre , 
la tabla evento la cual tiene la información de la plataforma a la cual pertenece, la cantidad de veces, el valor unitario , 
la descripción del evento y la fecha del evento, y por ultimo la tabla de costo el cual tiene el evento al que hace referencia , 
la plataforma y el costo asociado al evento . 

•Se creo un trigger en la tabla de evento para que una vez se realizara la inserción del evento se disparara una acción 
para insertar en la tabla de costo el costo del evento asociado al evento y a la plataforma que lo contiene.

