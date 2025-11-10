'''
Si tu código realiza una división, debes protegerlo contra la posibilidad de dividir por cero, lo que detendría el programa.
'''
dividendo = 100
divisor = 0

try :
    resultado = dividendo / divisor
    print(f"resultado: {resultado}")
except ZeroDivisionError:
    print("⚠️ Advertencia: Intento de división por cero detectado y prevenido.")
    resultado = None
