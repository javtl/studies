# Simular una Cola (Queue) de manera eficiente utilizando collections.deque. 
# Debes demostrar el principio FIFO (First In, First Out: el primero que entra es el primero que sale)
# para manejar una lista de clientes en espera.

from collections import deque

cola_clientes = deque(["Cliente A", "Cliente B"])

print(f"Estado inicial cola: {cola_clientes}")
print("-" * 30) # imprime - 30 veces

cola_clientes.append("Cliente C")
cola_clientes.append("Cliente D")

print(f"Cola Actualizada: {cola_clientes}")

cliente_atendido_1 = cola_clientes.popleft()
cliente_atendido_2 = cola_clientes.popleft()

print("-" * 30)
print(f"1-Cliente atendido: {cliente_atendido_1}")
print(f"1-Cliente atendido: {cliente_atendido_2}")