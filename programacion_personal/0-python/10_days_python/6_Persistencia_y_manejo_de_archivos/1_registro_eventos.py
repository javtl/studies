# 🛠️ Desafío del Día 6: El Sistema de Logs de Seguridad

# Imagina que estás construyendo un bot que vigila accesos a un servidor. 
# Debes crear un script que gestione un archivo de texto llamado `seguridad.txt`.

# Crea el archivo `seguridad.txt` en modo escritura (`'w'`).
with open ("seguridad.txt", "modo") as r:
    print("=== REGISTRO DE SEGURIDAD V1.0 ===")
    print("\n")

# Escribe una cabecera que diga: `=== REGISTRO DE SEGURIDAD V1.0 ===` y un salto de línea.

# Tarea 2: Función de Registro
# Crea una función llamada `registrar_evento(evento)`.
# La función debe abrir el archivo en modo **append** (`'a'`).
# Debe escribir el evento recibido más un salto de línea.
# **Pista:** Usa `with open(...) as f:` dentro de la función.

def registrar_evento(evento):
    with open("seguridad.txt", "a") as f:
        f.write(evento + "\n")


# Tarea 3: Simulación de Ataque
# Llama a la función 3 veces con estos mensajes:
# 1. "Usuario 'admin' ha iniciado sesión."
# 2. "Intento de acceso fallido desde IP 192.168.1.50."
# 3. "Cierre de sesión del usuario 'admin'."

registrar_evento("Usuario 'admin' ha iniciado sesión.")
registrar_evento("Intento de acceso fallido desde IP 192.168.1.50.")
registrar_evento("Cierre de sesión del usuario 'admin'.")

# Tarea 4: Auditoría Final
# Abre el archivo en modo lectura (`'r'`).
# Lee todas las líneas.
# Imprime el contenido completo en la consola.
# Imprime al final un mensaje que diga: `"Se han detectado [X] eventos de seguridad"`, 
# donde X es el número de líneas (menos la cabecera).

with open("seguridad.txt", "r") as f:
    lineas = f.readlines() # Esto crea una lista con todas las líneas

total_eventos = len(lineas) -1

for i in range(0,total_eventos):
    print(f"{lineas[i].strip()}")

print(f"\nSe han detectado {total_eventos} eventos de seguridad.")