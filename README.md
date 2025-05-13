# PRUEBA TECNICA PARA BENDITAESSENCE
En este repositorio se encontrara el codigo fuente, junto con demas explicaciones para completar satisfactoriamente la prueba

## Prueba 1, Trabajo Inicial con Salesforce

Se logra completar el registro inicial y podemos tener acceso al board principal en salesforce

![board principal](README-Images/board-principal.png)

Despues de realizar una exploración, se encuentra la forma de crear los objetos personalizados y despues crearlos
conforme lo pide la prueba

![boton configuracion](README-Images/boton-configuracion.png)
![panel_configuracion](README-Images/panel-configuracion.png)

Evidentemente, se observanm los ultimos objetos trabajados, sin embargo, entrando a la pesataña 
"Gestor de objetos" los podemos visualizar en la lista de los demas objetos

![cliente-en-panel](README-Images/objeto-cliente-panel.png)
![entrega-en-panel](README-Images/objeto-entrega-panel.png)

Para crear la realción entre los dos objetos, se crea desde entrega, para que se pueda cumplir la condición de que 
el cliente puede tener muchas entregas

![relacion](README-Images/relacion-entre-objetos.png)

Ahora, volviendo al panel principal de configuración, se añade un flujo para actualizar la Fecha de entrega
dentro del objeto Entrega

![panel-automatizacion](README-Images/boton-flujos.png)

y configuramos el flujo como se muestra a continuación

![lista-flujos](README-Images/lista-flujos.png)
![flujo-creado](README-Images/creacion-flujo.png)


## Prueba 2, Creación de un API REST

En este repositorio se encuentra creada una API REST para la creación y consulta de clientes y entregas
con su respectiva relación de 1 a muchos, Además, se adjunta tambien la coleccion POSTMAN usada para 
realizar ciertas pruebas 

## Conclusiones


De esta prueba técnica se aprendió basicamente la gestion de objetos dentro de salesforce y la automatización
para completar cierta información dentro de este, a continuación, el link del video mostrando todo lo realizado
durante esta prueba

[Video](https://www.youtube.com/watch?v=PTSvPfET3JQ)
