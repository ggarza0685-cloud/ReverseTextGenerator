
# Reverse Text Generator (Generador de Texto en Reversa)

Este proyecto contiene una herramienta simple en Java diseñada para invertir cadenas de texto de forma eficiente. Es ideal para tareas de procesamiento de texto, juegos de palabras o demostraciones académicas sobre la manipulación de flujos de caracteres.

## Características
* **Eficiencia de memoria:** Utiliza la clase `StringBuilder` de Java, lo que evita la creación innecesaria de múltiples objetos `String` en memoria.
* **Inversión instantánea:** Hace uso del método nativo `.reverse()`, optimizado a bajo nivel.

---

## Requisitos
* **Java Development Kit (JDK):** Versión 8 o superior.
* Cualquier IDE de Java (IntelliJ IDEA, Eclipse, NetBeans) o la terminal del sistema.

---

## Cómo Funciona el Código

El generador sigue una lógica estructurada en tres pasos principales:

1.  **Instanciación:** Se crea un objeto de tipo `StringBuilder`.
2.  **Entrada de datos:** Se añade la cadena de texto base mediante el método `.append()`.
3.  **Procesamiento y Salida:** El método `.reverse()` invierte el orden de los caracteres y `.toString()` lo convierte de nuevo a una cadena de texto estándar para ser impresa en la consola.

> **Nota:** En el ejemplo base, la cadena `"sever la odnalbah"` se transforma automáticamente en `"hablando al reves"`.

---

## Licencia y Créditos
Este componente es de código abierto y de uso libre para desarrollo, pruebas y proyectos educativos.
