# Analizador de Alertas Cripto (Strings + Condicionales): Crea una variable 
# mensaje_servidor = " ERROR:La transaccion de BTC ha fallado ".
# Limpia los espacios sobrantes al inicio y final.
# Convierte todo el mensaje a mayúsculas.
# Si el mensaje contiene la palabra "ERROR", imprime "🚨 Alerta de Sistema detectada".
# Si no, pero contiene "EXITO", imprime "✅ Operación completada".
# Pista: Usa el operador in que aprendimos ayer dentro del if.

mensaje_servidor = " ERROR:La transaccion de BTC ha fallado "

mensaje_sin_espacios = mensaje_servidor.strip()

mensaje_a_mayusculas = mensaje_sin_espacios.upper()

if "ERROR" in mensaje_a_mayusculas :
    print("🚨 Alerta de Sistema detectada")
elif "EXITO" in mensaje_a_mayusculas :
    print("✅ Operación completada")
