package com.example.chatinterface

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

enum class User { LOCAL, REMOTE }

open class Message(val sender: User, val text: String, val timestamp: LocalDateTime)

val formatter: DateTimeFormatter =
    DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")  // TODO: check wrong pattern. IDE made me declare Type explicitly

val messages = listOf(
    Message(
        User.REMOTE,
        "Hola, ¿has oído hablar de la programación reactiva en Android?",
        LocalDateTime.parse("01/01/2021 10:00", formatter)
    ),
    Message(
        User.LOCAL,
        "No, no he oído hablar de eso. ¿Puedes explicármelo?",
        LocalDateTime.parse("01/01/2021 10:05", formatter)
    ),
    Message(
        User.REMOTE,
        "Claro, es un paradigma de programación que se centra en manejar flujos de datos y eventos asíncronos. Fue introducido por primera vez en Android con la aparición de la biblioteca RxJava en 2013 por Netflix",
        LocalDateTime.parse("01/01/2021 10:10", formatter)
    ),
    Message(
        User.LOCAL,
        "Entiendo, entonces es una forma de manejar tareas asíncronas de manera más eficiente",
        LocalDateTime.parse("01/01/2021 10:15", formatter)
    ),
    Message(
        User.REMOTE,
        "Exacto, se utiliza para manejar tareas como peticiones de red, operaciones de base de datos y entrada de usuario de una forma más eficiente y mantenible. En resumen, permite manejar de manera sencilla los cambios de estado y eventos en una aplicación, lo que ayuda a evitar problemas de sincronización de estado y aumenta la estabilidad y rendimiento del sistema",
        LocalDateTime.parse("01/01/2021 10:20", formatter)
    ),
    Message(
        User.REMOTE,
        "Compose se basa en la programación reactiva, permitiendo a los desarrolladores declarar cómo debe ser su interfaz de usuario en función del estado y los eventos. Esto ayuda a crear un código más legible, mantenible y fácil de probar",
        LocalDateTime.parse("01/01/2021 10:20", formatter)
    ),
    Message(
        User.LOCAL,
        "Eso es realmente interesante. Definitivamente investigaré más sobre ello. ¡Gracias por explicármelo!",
        LocalDateTime.parse("01/01/2021 10:25", formatter)
    ),
    Message(
        User.LOCAL,
        "Por cierto, escribo otro mensaje porque necesito forzar a que aparezca la barra de desplazamiento.",
        LocalDateTime.parse("01/01/2021 10:25", formatter)
    ),
    Message(
        User.REMOTE,
        "Ok.",
        LocalDateTime.parse("01/01/2021 10:20", formatter)
    ),
    Message(
        User.LOCAL,
        "Ok.",
        LocalDateTime.parse("01/01/2021 10:20", formatter)
    ),
    Message(
        User.REMOTE,
        "Que sepas que estás suspenso por únicamente escribir un mensaje con dos letras y un punto. Ese punto es agresivo para el lector, por lo que se te deducen 9,5 puntos de tu nota final. Lo siento ;).",
        LocalDateTime.parse("01/01/2021 10:20", formatter)
    )
)