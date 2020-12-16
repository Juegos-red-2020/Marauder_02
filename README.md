# GDD Marauder


TÍTULO: Marauder

ESTUDIO/DISEÑADORES: Miguel Gálvez Lucena, Diego Penedo Andrés, Karim Elein Castillo Ordinola, Jose Pablo Baño García.

GÉNERO: Plataformas

CORREOS UNIVERSITARIOS: m.galvez.2018@alumnos.urjc.es, d.penedo.2018@alumnos.urjc.es, ke.castillo.2017@alumnos.urjc.es, jp.bano.2016@alumnos.urjc.es

TRELLO: https://trello.com/invite/b/7TDbjcXg/570ec36ceab6d6e421ffdf338bea6fb6/juegos-en-redes 

PLATAFORMA:  PC

VERSIÓN: 1.0

SINOPSIS DEL JUEGO: Dos exploradores se encuentran atrapados en una nave abandonada. A medida que avanzan en su búsqueda de una salida, una serie de peligros irán surgiendo y deberán colaborar para superar los obstáculos y buscar una salida.

CATEGORÍA: Puzles, acción.

LICENCIA: Apache 2.

DINÁMICAS: Movimientos de empuje, interacción con el entorno y resolución de puzles.

PÚBLICO: Tipo de jugador casual, más dedicado a jóvenes.

# VISIÓN GENERAL DEL JUEGO

Marauder es un juego multijugador cooperativo. Dos exploradores, atrapados en el interior de una nave con elementos de futuristas. Al tratarse de un juego de puzles y acción permite al jugador experimentar diversas mecánicas en los puzles. Finalmente, el ritmo del juego sería más lento para ir pensando en los puzles cooperativos que se encuentran dispersos por la nave. El objetivo de los exploradores en encontrar la salida de la nave y salir ambos con vida

# DINÁMICA DEL JUEGO

Cámara: En tercera persona tipo plataformas.

Periféricos: Teclado

Controles: A (Izquierda), D (Derecha), S (abajo), W (salto); Para el segundo personaje, las flechas de dirección, con la misma función.

Guardar/cargar: No está implementado, dado que la breve duración del juego no lo hace especialmente necesario.

# PERSONAJES

Nombre: Deva

Descripción: Son saqueadores de tesoros interestelares, provistos de una capucha y un vestuario que a su vez hace de armadura sencilla.

Concepto: Uno de los protagonistas del juego y personaje controlado por el jugador. 

Momento: Aparición al principio del juego al ser uno de los principales.

Habilidades: Fuerza para empujar objetos pesados.

>_

Nombre: Reni

Descripción: Son saqueadores de tesoros interestelares, provistos de una capucha y un vestuario que a su vez hace de armadura sencilla.

Concepto: Uno de los protagonistas del juego y personaje controlado por el jugador. 

Momento: Aparición al principio del juego al ser uno de los principales.

Habilidades: Agilidad para saltar más alto y escala paredes.

# ARTE CONCEPTUAL

Guía de estilo:
 
![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/Dise%C3%B1o.png>)
![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/Principio.jpg>)

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/map_Grande.png>)



# CAMBIOS RESPECTO AL PROTOTIPO

El cambio más notable del concepto inicial es la ausencia de Pturm, la criatura que perseguía a los personajes principales. En su lugar, el peligro en esta versión viene de los pozos y los láseres, obstáculos del escenario en los que si uno de los personajes cae, pierde una vida.

La idea original de Pturm como una criatura inteligente era demasiado ambiciosa, así que se decidió dejarlo en un contador; cuando terminase el tiempo Pturm aparecería y sería game over. Sin embargo, consideramos que los obstáculos eran suficiente peligro para que el juego presentase un reto más allá de los puzles y el contador sería algo redundante, por lo que no ha sido implementado.

Otros cambios menores incluyen pantalla de créditos y la eliminación de una sala de espera, ya que el juego no tarda tanto en cargar como para que sea necesaria.

# DIAGRAMA DE FLUJO DE PANTALLAS

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/Diagrama.jpg>)


# PANTALLAS

>Menú:

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/Menu.PNG>)

En el menú principal podemos seleccionar a qué pantalla ir. Jugar nos lleva a la pantalla de selección de personaje. En tutorial nos lleva al nivel tutorial, un nivel más sencillo con instrucciones para que los jugadores aprendan las mecánicas. Créditos lleva a la pantalla de créditos y salir cierra el juego.

>Créditos:

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/Inicio.png>)

En esta pantalla podemos ver a las personas que han trabajado en el juego. Aparece al terminar el nivel principal, aunque también se puede acceder a ella desde el menú.

>Selección de personaje:

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/SelecPer.png>)

Al colocar el cursor sobre un personaje, informa al jugador de sus habilidades y controles. Una vez seleccionado, lleva al jugador al nivel principal.

>Nivel:

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/Gamplay.png>)

Tanto en el nivel principal como en el tutorial se puede ver a ambos personajes en el escenario correspondiente. En la esquina superior izquierda se pueden ver las vidas que les quedan antes del game over. Ambos niveles se explicarán en detalle en el apartado niveles.

>Game Over:

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/GameOver.png>)

Pantalla que aparece cuando el personaje se quedan sin vidas (tienen 3 entre los dos personajes). Permite volver al menú o reintentar el nivel.




# Niveles

>Glosario:

Deva: Personaje con la habilidad de empujar cajas.

Reni: Personaje con más velocidad y capaz de saltar distancias más largas que Deva.

C: Caja empujable.

S: Espacio que Reni es capaz de cruzar de un salto, pero Deva se caería.

B: Botón, se activa cuando tiene un gran peso encima. En el nivel tutorial lo puede pisar Reni al saltar desde tanta longitud directamente al botón. En el  nivel principal, los botones solo son activables si Deva empuja una caja encima. Al activarse, normalmente crean o destruyen plataformas.

Pa: Palanca. Función similar a el boton, solo que se activa al contacto de Deva o Reni.

Pl: Plataforma que se crea o destruye al activa un botón o una palanca.

L: Rayo láser que impide el paso. Si lo toca el jugador, pierde una vida y regresa al inicio.

Le: Láser esquivable. Láseres que se mueven de manera intermitente por los que el jugador puede pasar, siempre y cuando lo haga de manera ágil para no tocarlos.

Cg: Caja generador. Funciona como una caja normal pero en realidad es el generador de electricidad de la nave. Al moverlo a su botón, desconecta la corriente eléctrica y todos los láseres desaparecen.

Escaleras: Se puede subir y bajar por ellas.

>_

NIVEL TUTORIAL:

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/mapaNotas2.png>)

Los personajes comienzan a la izquierda del nivel. Reni es capaz de saltar S1 y al caer, activa el botón B1. B1 genera la caja C1. Más adelante se encuentra la palanca P1, que al activarla genera una plataforma que cubre el hueco en S1, por la que Deva puede pasar.

Reni es capaz de saltar de nuevo S2 sin problemas. Para poder realizar el salto, Deva debe empujar la caja C1 hasta el borde de S2 y que caiga abajo. Subiéndose a la caja, la distancia a saltar es menor y la puede cruzar. Así, ambos son capaces de cruzar todos los huecos y llegar a la salida sin problemas.

>_

NIVEL PRINCIPAL:

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/mapaNotas.png>)

Aparecen de nuevo en la esquina superior izquierda. Reni salta S1 y S1. Baja por las escaleras al piso de abajo y activa P1, que crea Pl1 y permite que tanto Deva como la caja C2 pasen por ese hueco. Reni vuelve a subir arriba y activa P2, que crea una plataforma en S2. Ahora Deva puede subir al piso de arriba por las escaleras y empujar la caja C1 al botón B1. B1 activa Pl2, lo que permite que empuje la caja C2 hasta ahí y la deje caer encima del botón B2. Esto activa B2 y crea la plataforma Pl3, lo que les permite continuar al resto del nivel.

A partir de aquí, no es difícil llegar a la salida. Sin embargo, no es posible utilizarla a no ser que se hayan presionado los botones B3 y B4. Para ello utilizaremos las cajas B3 y B4. Pero estas cajas son inaccesibles, ya sea porque Deva no puede llegar adonde están o porque las bloquean varios láser L. Después de explorar un rato, el jugador que lleve a Reni se percatará de que puede realizar el salto S3, que le llevará a la palanca P3.

Al activar P3 podrá cruzar por la plataforma Pl5, que le lleva a la sección izquierda del mapa. En esta sección se encuentra el generador Cg, con el que podrían desactivar todos los láser. Sin embargo, se necesita a Deva para moverlo. Reni debe bajar hasta encontrar la palanca P4, que activa la plataforma Pl6. Aunque probablemente le cueste llegar, y deba esquivar diversos láseres Le, es posible que Deva llegue al otro lado de Pl6.

Una vez esté Deva en Pl6 puede subir cuidadosamente hasta arriba, donde se encuentra Cg. Utiliza Cg para activar el botón B5 y al realizar esta acción, de manera simultánea activa la plataforma Pl4 y desactiva todos los láseres. Pasando por Pl4 puede llegar a la caja C3 y empujarla hasta abajo, para que pulse el botón B3 o B4. Al haber desactivado los láseres, también se hace accesible en la sección de la derecha la caja C4. Se empuja C4 al botón restante y eso por fin activaría la salida.




# Referencias

Pturm

https://www.artstation.com/artwork/Er9a2



Items

https://www.artstation.com/artwork/RYJONX



Caja(Modificado)

https://www.artstation.com/artwork/1nOAxX



Tiles Entorno(Modificado)

https://www.artstation.com/artwork/baDzPv



Escalera(Modificado)

https://imgur.com/r/PixelArt/yALAtR8



Palanca

https://runwthewolves.tumblr.com/post/168756860046/tiny-pixel-lever-for-my-game-the-wishgranter



# LICENCIAS

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/license_certificate_6GYFMNZVPH%20(1).txt>)

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/license_certificate_92PDVKGTNL%20(2).txt>)

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/license_certificate_BA9P75WLFJ.txtt>)

![alt text](<https://github.com/Juegos-red-2020/Esqueleto/blob/main/Pantallazos-Readme/license_certificate_DWE46FXV5H%20(1).txt>)



